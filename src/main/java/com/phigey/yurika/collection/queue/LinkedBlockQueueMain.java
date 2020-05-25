package com.phigey.yurika.collection.queue;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author cfa
 */
public class LinkedBlockQueueMain {
    public static void main(String[] args) {

        LinkedBlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();
        LinkedBlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>();

        blockingQueue.offer("aa");
        blockingDeque.offer("aa");
    }
}
