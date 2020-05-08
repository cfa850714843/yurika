package com.phigey.yurika.entity;


import java.util.Objects;

/**
 * @author cfa
 */
public class Food {
    private String name;
    private Float price;

    public Food(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Food() {
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.price.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof Food)) {
            return false;
        }
        Food of = (Food) obj;
        return Objects.equals(this.name, of.name) && Objects.equals(this.price, of.price);
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
