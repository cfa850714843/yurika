package com.phigey.yurika.unsafe;

import com.phigey.yurika.entity.Food;
import sun.misc.Unsafe;
import java.lang.reflect.Field;

/**
 * @author cfa
 */
public class UnsafeMain01 {
    public static void main(String[] args) {
        try {
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            Unsafe u = (Unsafe) unsafeField.get(null);
            Food obj = (Food) u.allocateInstance(Food.class);

            System.out.println(obj);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
