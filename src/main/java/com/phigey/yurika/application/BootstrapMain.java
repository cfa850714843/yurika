package com.phigey.yurika.application;


import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author cfa
 */
public class BootstrapMain {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.containsKey("");
        hashMap.containsValue("");
        Hashtable hashtable = new Hashtable();
        hashtable.contains("");
        hashtable.containsKey("");
        hashtable.containsValue("");
        check();
    }

    public static boolean check(){
        boolean a = false;
        Object b = 1;
        a = b instanceof Boolean;
        return a;
    }
}
