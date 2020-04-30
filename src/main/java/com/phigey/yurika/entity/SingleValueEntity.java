package com.phigey.yurika.entity;

/**
 * @author cfa
 */
public class SingleValueEntity {
    private String name;

    public SingleValueEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SingleValueEntity(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
