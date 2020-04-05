package com.phigey.yurika.map;


import com.phigey.yurika.entity.HashZeroEntity;

import java.util.HashMap;

/**
 * @author cfa
 */
public class HashMapMain {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        for (int i = 0; i < 10; i++) {
            hashMap.put(new HashZeroEntity(i, "s" + i, 0.1f), i);
        }

    }
}
