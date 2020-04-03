package com.phigey.yurika.map;

import com.phigey.yurika.entity.HashZeroEntity;

/**
 * @author cfa
 *
 * hash均匀的情况下
 * 转换红黑树条件
 * 扩容21次, table长度为2的24次方
 *
 * ===============================
 * 元素个数: 9998880
 * 数组长度: 16777216
 * 转换红黑树
 * ===============================
 *
 * hash集中的情况下
 *
 * ===============================
 * 元素个数: 10
 * 数组长度: 64
 * 转换红黑树
 * ===============================
 *
 *
 */
public class MyHashMapMain {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();

        for (int i = 0; i < 100; i++) {
            System.out.println("put: " + i);
            hashMap.put(new HashZeroEntity(i, "s" + i, 0.1f), i);
        }

    }
}
