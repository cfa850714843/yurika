package com.phigey.yurika.reflect;

import com.phigey.yurika.entity.ReflectP1;

/**
 * @author cfa
 */
public class ReflectMain01 {
    public static void main(String[] args) {


        try {
            Class<ReflectP1> clazz = ReflectP1.class;
            ReflectP1 reflectP1 = clazz.newInstance();
            reflectP1.m2();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
