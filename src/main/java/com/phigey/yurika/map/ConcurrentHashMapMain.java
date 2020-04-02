package com.phigey.yurika.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author cfa
 */
public class ConcurrentHashMapMain {
    public static void main(String[] args) {
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i = 0; i < 300; i++) {
            final int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println(finalI + "" + j);
                        concurrentHashMap.put(finalI + "" + j, finalI + "" + j);
                    }
                }
            }).start();
        }
    }
}
