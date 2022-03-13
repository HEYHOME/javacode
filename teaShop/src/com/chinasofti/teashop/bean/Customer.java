package com.chinasofti.teashop.bean;

/**
 * @author hey
 * @description
 * @create 2020-06-16-8:30
 */
public class Customer {
    private int id;
    private String birthday;
    private int score;

    public int getId() {
        return id;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", birthday='" + birthday + '\'' +
                ", score=" + score +
                '}';
    }
}
