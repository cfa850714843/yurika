package com.phigey.yurika.test;

import java.util.UUID;

/**
 * @author cfa
 */
public class UUIDTest {
    public static void main(String[] args) {

        String uid1 = "22c5e52a-b758-4559-87b3-fd7b38de58af";


        System.out.println(UUID.fromString(uid1).toString().equals(uid1));

    }
}
