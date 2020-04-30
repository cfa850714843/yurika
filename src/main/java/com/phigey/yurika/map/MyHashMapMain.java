package com.phigey.yurika.map;

import com.phigey.yurika.entity.HashZeroEntity;
import com.phigey.yurika.entity.SingleValueEntity;

/**
 * @author cfa
 *
 * hash均匀的情况下
 * 转换红黑树条件
 * 扩容21次, table长度为2的24次方
 *
 * ===============================
 * - 元素个数: 9998880
 * -  数组长度: 16777216
 *  - 转换红黑树
 * ===============================
 *
 * ====================
 * 转红黑树
 * table长度 = 8388608
 * 元素个数 = 5599273
 * ====================
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
        for (int i = 1; i < 100; i++) {
            hashMap.put(new HashZeroEntity("s" + i), i);
        }

    }
}
