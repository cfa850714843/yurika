package com.phigey.yurika.collection.set;

import com.phigey.yurika.entity.Food;
import com.phigey.yurika.entity.Fruit;

import java.util.HashSet;

/**
 * @author cfa
 */
public class HashSetMain {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        hashSet.add(new Food("rice", 10f));
        System.out.println(hashSet.contains(new Food("rice", 10f)));

        hashSet.add(new Fruit("apple", 10f));
        System.out.println(hashSet.contains(new Fruit("apple", 10f)));

    }
}
