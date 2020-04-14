package com.phigey.yurika.entity;

/**
 * @author cfa
 */
public class Demo01 {
    public void fun01(int d) {
        System.out.println("fun01 { " + d + " } before");
        fun02(d);
        System.out.println("fun01 { " + d + " } after");
    }

    public void fun02(int d) {
        d += 2;
        System.out.println("fun02 { " + d + " }");
    }

}
