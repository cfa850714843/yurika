package com.phigey.yurika.io.nio;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.ReferenceCountUtil;

import java.nio.charset.Charset;


/**
 * @author cfa
 */
public class NettyClient {
    public static void main(String[] args) {
        EventLoopGroup workerGroup = new NioEventLoopGroup(100);
        try {
            Bootstrap b = new Bootstrap();
            b.group(workerGroup)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        public void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                                @Override
                                public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                    ChannelFuture future = ctx.writeAndFlush(Unpooled.copiedBuffer(("hello " + System.currentTimeMillis()).getBytes()));
                                    future.addListener(new ChannelFutureListener() {
                                        @Override
                                        public void operationComplete(ChannelFuture future) throws Exception {
                                            System.out.println(System.currentTimeMillis() + "send success!");
                                        }
                                    });
                                }

                                @Override
                                public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                                    String mess = ((ByteBuf) msg).toString(Charset.defaultCharset());
                                    System.out.println("client rec : " + mess + " " + System.currentTimeMillis());
                                    ReferenceCountUtil.release(msg);
                                }
                            });
                        }
                    });
            for (int i = 0; i < 1000000; i++) {
                ChannelFuture f = b.connect("127.0.0.1", 10034).sync();
                f.channel().closeFuture().sync();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }
}
