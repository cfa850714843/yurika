package com.phigey.yurika;


/**
 * @author cfa
 */
public class MainApplication {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            System.out.println(String.format("%06d", i));;
        }
    }
}
