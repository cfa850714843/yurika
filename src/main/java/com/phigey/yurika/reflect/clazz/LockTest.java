package com.phigey.yurika.reflect.clazz;

/**
 * @author cfa
 */
public class LockTest {

    static volatile int i = 0;

    public static void main(String[] args) {

        for (int j = 0; j < 1000000; j++) {
            m();
            n();
        }

    }

    public static void m() {

    }

    public static synchronized void n() {
        i++;
    }
}
