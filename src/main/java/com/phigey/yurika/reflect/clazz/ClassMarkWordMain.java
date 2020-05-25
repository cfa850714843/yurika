package com.phigey.yurika.reflect.clazz;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author cfa
 */
public class ClassMarkWordMain {
    public static void main(String[] args) {

        Object o = new Object();

        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        o.hashCode();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
