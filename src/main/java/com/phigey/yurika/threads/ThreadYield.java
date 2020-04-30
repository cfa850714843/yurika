package com.phigey.yurika.threads;



/**
 * @author cfa
 */
public class ThreadYield {

    volatile int a = 0;

    public void dealOdd() {
        while (a < 50) {
            if (a % 2==0) {
                Thread.yield();
            }
            System.out.println("ODD DEAL! value = " + a);
            a++;
        }
    }

    public void dealEven() {
        while (a < 50) {
            if (a % 2!=0) {
                Thread.yield();
            }
            System.out.println("EVEN DEAL! value = " + a);
            a++;
        }

    }
}
