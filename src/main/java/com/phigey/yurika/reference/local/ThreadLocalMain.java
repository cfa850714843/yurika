package com.phigey.yurika.reference.local;

import com.phigey.yurika.entity.Food;

import java.lang.ref.WeakReference;

/**
 * @author cfa
 */
public class ThreadLocalMain {
    public static void main(String[] args) {

        WeakReference<Food> wf = new WeakReference<>(new Food());
        ThreadLocal threadLocal= null;
        threadLocal.set(null);
        threadLocal.remove();

        System.out.println(wf.get());
        System.gc();
        System.out.println(wf.get());

    }
}
