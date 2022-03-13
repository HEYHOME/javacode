package com.chinasofti.teashop.bean;

/**
 * @author hey
 * @description
 * @create 2020-06-16-8:34
 */
public class Gift {
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
