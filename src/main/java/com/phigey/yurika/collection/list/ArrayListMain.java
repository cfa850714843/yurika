package com.phigey.yurika.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author cfa
 */
public class ArrayListMain {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < 30000000; i++) {
            arrayList.add(i);
        }

        arrayList.stream().map(n -> {
            System.out.println(n);
            return n;
        });

    }
}
