package com.phigey.yurika.entity;

/**
 * @author cfa
 */
public class HashZeroEntity {
    private String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public HashZeroEntity(String b) {
        this.b = b;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
