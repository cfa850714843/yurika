package com.phigey.yurika.io.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

/**
 * @author cfa
 */
public class JacksonMain {
    static ObjectMapper objectMapper = new ObjectMapper();
    public static void main(String[] args) {
        test1();
    }




    public static void test1(){

        HashMap hashMap = new HashMap();

        for (int i = 0; i < 10; i++) {
            hashMap.put("k" + i,"v" + i );
        }
        hashMap.toString();
        try {
            String mapStr = objectMapper.writeValueAsString(hashMap);

            System.out.println("=================================");

            System.out.println(mapStr);

            System.out.println("=================================");


            Map map = objectMapper.readValue(mapStr, Map.class);

            Set<Map.Entry> set = map.entrySet();

            for (Map.Entry entry : set) {
                System.out.print("k = " + entry.getKey());
                System.out.println(" v = " + entry.getValue());
            }


            List<Map> list = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                list.add(map);
            }

            String listStr = objectMapper.writeValueAsString(list);

            List a = objectMapper.readValue(listStr, List.class);

            for (Object o : a) {
                System.out.println(o.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
