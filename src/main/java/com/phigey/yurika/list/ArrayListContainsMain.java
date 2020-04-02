package com.phigey.yurika.list;

import com.phigey.yurika.entity.Food;
import com.phigey.yurika.entity.Fruit;

import java.util.ArrayList;

/**
 * @author cfa
 * list contains 方法在没有重写hashCode 与equals时 无法正确判断
 * list contains 方法在没有重写equals 无法正确判断
 * list contains 方法在只重写equals 可以正确判断
 *
 */
public class ArrayListContainsMain {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(new Food("rice", 10f));
        System.out.println(arrayList.contains(new Food("rice", 10f)));

        arrayList.add(new Fruit("apple", 10f));
        System.out.println(arrayList.contains(new Fruit("apple", 10f)));
    }
}
