package com.phigey.yurika.collection.queue;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author cfa
 */
public class LinkedBlockQueueMain {
    public static void main(String[] args) {

        LinkedBlockingQueue blockingQueue = new LinkedBlockingQueue<>();
        LinkedBlockingDeque blockingDeque = new LinkedBlockingDeque<>();

        blockingQueue.add("aa");
        blockingDeque.add("aa");
    }
}
