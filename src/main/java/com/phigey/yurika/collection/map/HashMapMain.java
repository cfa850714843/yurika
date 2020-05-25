package com.phigey.yurika.collection.map;


import com.phigey.yurika.entity.HashZeroEntity;

import java.util.HashMap;

/**
 * @author cfa
 */
public class HashMapMain {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        for (int i = 0; i < 100; i++) {
            hashMap.put(new HashZeroEntity("s" + i), i);
        }

    }
}
