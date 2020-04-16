package com.phigey.yurika.entity;

/**
 * @author cfa
 */
public class HashZeroEntity {
    private int a;
    private String b;
    private float c;

    public HashZeroEntity(int a, String b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int hashCode() {
        return b.hashCode();
    }
}
