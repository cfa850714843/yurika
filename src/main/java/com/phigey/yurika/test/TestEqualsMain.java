package com.phigey.yurika.test;

import com.phigey.yurika.entity.Food;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author cfa
 */
public class TestEqualsMain {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        for (int i = 0; i < 3; i++) {
            hashMap.put(new Food("rice", 10f), 1);
        }

        Set<Map.Entry> l =  hashMap.entrySet();
        for (Map.Entry entry : l) {
            System.out.println(entry);
        }
    }
}
