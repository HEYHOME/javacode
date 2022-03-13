package com.chinasofti.teashop.bean;

/**
 * @author hey
 * @description
 * @create 2020-06-16-8:24
 */
public class Goods {
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
