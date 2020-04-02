package com.phigey.yurika.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author cfa
 */
public class ArrayListMain {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < 30; i++) {
            arrayList.add(i);
        }

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

        for (Object o : arrayList) {
            System.out.println(o);
        }

    }
}
