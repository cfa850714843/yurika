package com.phigey.yurika.threads.aqs;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cfa
 */
public class ReentrantLockMain {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        for (int i = 0; i <3; i++) {
            reentrantLock.lock();
            System.out.println("lock = " + reentrantLock.getHoldCount());
        }
        try {
            System.out.println("== " + reentrantLock.getHoldCount());
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            while (reentrantLock.getHoldCount() > 0) {
                System.out.println("unlock = " + reentrantLock.getHoldCount());
                reentrantLock.unlock();
            }
        }
    }
}
