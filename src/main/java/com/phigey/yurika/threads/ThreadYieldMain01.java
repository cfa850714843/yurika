package com.phigey.yurika.threads;

/**
 * @author cfa
 */
public class ThreadYieldMain01 {
    public static void main(String[] args) {

        ThreadYield threadYield = new ThreadYield();

        new Thread() {
            @Override
            public void run() {
                threadYield.dealEven();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                threadYield.dealOdd();
            }
        }.start();


    }
}
