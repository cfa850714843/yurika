package com.phigey.yurika.object;

import java.util.HashMap;

/**
 * @author cfa
 */
public class ObjectMain {
    public static void main(String[] args) {

        Object object = new Object();

        HashMap hashMap = (HashMap) object;

        hashMap.put("a", "a");

        System.out.println(hashMap);
        System.out.println(object);

    }
}
