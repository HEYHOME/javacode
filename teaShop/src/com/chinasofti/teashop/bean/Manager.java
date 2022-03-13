package com.chinasofti.teashop.bean;

/**
 * @author hey
 * @description
 * @create 2020-06-16-8:28
 */
public class Manager {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
