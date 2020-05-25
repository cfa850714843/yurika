package com.phigey.yurika.docker;


import java.util.regex.Pattern;

/**
 * @author cfa
 */
public class DockerfileMain {

    static Pattern pattern = Pattern.compile("[+-]*\\d+\\.?\\d*[Ee]*[+-]*\\d+");
    public static void main(String[] args) {

        String value = "11213111111111111111111111111111111111111111111111111111111111111111111111111111111";
        System.out.println(pattern.matcher(value).matches());

        System.out.println(Double.valueOf(value));
    }

}
