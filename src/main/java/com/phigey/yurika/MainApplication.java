package com.phigey.yurika;


import com.phigey.yurika.entity.Demo01;

/**
 * @author cfa
 */
public class MainApplication {
    public static void main(String[] args) {
        int a = 10;
        Demo01 demo01 = new Demo01();
        demo01.fun01(a);
        System.out.println("fun01 { } " + a);
    }
}
