package com.phigey.yurika.threads.pool;

import java.util.concurrent.ForkJoinPool;

/**
 * @author cfa
 */
public class ForkJoinPoolMain {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(()->{
            System.out.println("aa");
        });

        forkJoinPool.shutdown();
    }
}
