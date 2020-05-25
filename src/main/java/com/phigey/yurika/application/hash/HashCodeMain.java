package com.phigey.yurika.application.hash;
import com.phigey.yurika.entity.SingleValueEntity;
/**
 * @author cfa
 */
public class HashCodeMain {
    public static void main(String[] args) {

        for (int i = 0; i < 1000000; i++) {
            System.out.println(new SingleValueEntity("s" + i).hashCode());
        }

    }
}
