package com.phigey.yurika.io.file;

import java.io.IOException;

public class FileUtilsMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        /*try {
            //262s
            FileUtils.copyDirectory(new File("D:/download/jdk-8u251-docs-all/docs"), new File("D:/download/jdk-8u251-docs-all/docs"));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        try {
            FileUtil.copyFolder("D:/download/jdk-8u251-docs-all/docs", "D:/download/jdk-8u251-docs-all/docs1");
            /*FileUtil.copyFile("D:/download/jdk-8u251-docs-all/docs/index.html", "D:/download/jdk-8u251-docs-all/home.html");*/
        } catch (IOException e) {
            e.printStackTrace();
        }




        System.out.println(((System.currentTimeMillis() - startTime) / 1000) + "s");

    }
}
