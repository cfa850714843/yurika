package com.phigey.yurika;


/**
 * @author cfa
 */
public class MainApplication {
    public static void main(String[] args) {
        String DATASET_SPEC_STR = "D:/file/project/ce587ca6-b1fa-4b0c-9ed2-2bbf4ed3fa3e/dataset/sw/test-列逗号.txt";
        System.out.println(DATASET_SPEC_STR.substring(DATASET_SPEC_STR.indexOf("/dataset")));
    }
}
