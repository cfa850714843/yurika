package com.phigey.yurika.stream;

import com.phigey.yurika.entity.Food;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cfa
 *
 * size = 100000
 *
 * for : 10s
 * stream: 55
 *
 * size = 200000
 *
 * for : 21s
 * stream: 60
 *
 * size = 300000
 *
 * for : 15s
 * stream: 49
 *
 * size = 500000
 *
 * for : 36s
 * stream: 72
 *
 * size = 1000000
 * for: 1199
 * stream: 494
 *
 * size = 1000000
 * for: 1199
 * stream: 494
 *
 */
public class ArrayListMain01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 800000; i++) {
            list.add("str" + i);
        }

        long start = System.currentTimeMillis();

        List<Food> foods =
//                list.stream().map(s -> new Food(s, 0.1f)).collect(Collectors.toList());
                new ArrayList<>();


        for (String s : list) {
            foods.add(new Food(s, 0.1f));
        }


        System.out.println(System.currentTimeMillis() - start);


    }
}
