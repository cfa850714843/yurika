package com.phigey.yurika.nio;

/**
 * @author cfa
 */
public class NettyMain01 {
    public static void main(String[] args) throws Exception {
        int port = 10034;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }
        new DiscardServer(port).run();
    }
}
