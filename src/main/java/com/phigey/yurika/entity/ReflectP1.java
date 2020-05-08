package com.phigey.yurika.entity;

/**
 * @author cfa
 */
public class ReflectP1 {

    private int v1 = 3;

    public static void m1(){
        System.out.println("m1!");
    }
    @SuppressWarnings("dead!")
    public void m2(){
        System.out.println("m2!");
    }
    public final void m3(){
        System.out.println("m3!");
    }
    public void m4(){
        System.out.println("m4!");
    }
}
