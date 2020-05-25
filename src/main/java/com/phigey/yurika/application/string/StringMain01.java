package com.phigey.yurika.application.string;

/**
 * @author cfa
 */
public class StringMain01 {
    public static void main(String[] args) {
        String str = "北京站5分钟粒度.xlsx.2.28日.xlsx";
        System.out.println(str.substring(0, str.lastIndexOf(".")));
    }
}
