package com.chinasofti.teashop.db;

import com.chinasofti.teashop.bean.Customer;
import com.chinasofti.teashop.bean.Goods;
import com.chinasofti.teashop.bean.Manager;

/**
 * @author hey
 * @description
 * @create 2020-06-16-8:29
 */
public class DB {
    public Customer[] customers = new Customer[100];
    public Goods[] goodses = new Goods[100];
    public Manager manager = new Manager();
    public DB(){
       initCustomers();
       initGoods();
       initManager();
    }
    public void initCustomers(){
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer();
        }
        customers[0].setId(1001);
        customers[0].setBirthday("08/17");
        customers[0].setScore(100);
        customers[1].setId(1002);
        customers[1].setBirthday("09/17");
        customers[1].setScore(105);
        customers[2].setId(1003);
        customers[2].setBirthday("10/17");
        customers[2].setScore(109);
    }
    public void initGoods(){
        for (int i = 0; i < goodses.length; i++) {
            goodses[i] = new Goods();
        }
        goodses[0].setName("红茶");
        goodses[0].setPrice(100);
        goodses[1].setName("铁观音");
        goodses[1].setPrice(200);
        goodses[2].setName("普洱");
        goodses[2].setPrice(150);
    }
    public void initManager(){
        manager.setName("admin");
        manager.setPassword("123");
    }
}
