package com.phigey.yurika.nio;

import java.nio.channels.Selector;

/**
 * @author cfa
 */
public class NettyMain01 {
    public static void main(String[] args) {
        try {

            Selector selector = Selector.open();

            selector.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
