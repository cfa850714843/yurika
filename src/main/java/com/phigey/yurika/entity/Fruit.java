package com.phigey.yurika.entity;


import java.util.Objects;

/**
 * @author cfa
 *
 * list contains 方法在没有 hashCode 与equals 无法正确判断
 *
 *
 */
public class Fruit {
    private String name;
    private Float price;

    public Fruit(String name, float price) {
        this.name = name;
        this.price = price;
    }

/*    @Override
    public int hashCode() {
        return this.name.hashCode() + this.price.hashCode();
    }*/

    @Override
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof Fruit)) {
            return false;
        }
        Fruit of = (Fruit) obj;
        return Objects.equals(this.name, of.name) && Objects.equals(this.price, of.price);
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
