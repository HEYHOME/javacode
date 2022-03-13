package com.chinasofti.teashop.ui;

import com.chinasofti.teashop.bean.Customer;
import com.chinasofti.teashop.bean.Goods;
import com.chinasofti.teashop.manager.CustomerManager;

import java.util.Scanner;

/**
 * @author hey
 * @description
 * @create 2020-06-16-9:03
 */
public class Menu {
    Scanner in = new Scanner(System.in);
    private Customer[] customers;
    private Goods[] goodses;
    public void setData(Customer[] customers,Goods[] goodses){
        this.customers=customers;
        this.goodses=goodses;
    }
    public static void main(String[] args) {
        new Menu().showLoginMenu();
    }

    public String acceptInput(String... item) {
        String result = null;
        boolean con = true;
        do {
            System.out.print("请输入: ");
            result = in.next();
            boolean flag = false;
            for (int i = 0; i < item.length; i++) {
                if (result.equalsIgnoreCase(item[i])) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                con = false;
            } else {
                System.out.print("输入错误,请重新输入:");
                con = true;
            }
        } while (con);
        return result;
    }

    public void showLoginMenu() {
        System.out.println("\t\t欢迎使用茶城管理系统");
        System.out.println("**********************************");
        System.out.println("\t\t1.登录茶友系统");
        System.out.println("\t\t2.修改管理员密码");
        System.out.println("\t\t3.退出");
        System.out.println("***********************************");
    }

    public void showMainMenu() {
        System.out.println("\t\t欢迎使用茶城管理系统");
        System.out.println("**********************************");
        System.out.println("\t\t1.茶友信息管理");
        System.out.println("\t\t2.茶叶结算");
        System.out.println("\t\t3.回馈");
        System.out.println("\t\t4.注销");
        System.out.println("***********************************");
        boolean con = true;
        do {
            String choose = acceptInput("1", "2", "3", "4");
            switch (choose) {
                case "1":
                    // 显示茶友信息管理菜单
                    showCustMenu();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    con = false;
                    break;
            }
        } while (con);
        showLoginMenu();// 只能显示登陆菜单
    }

    public void showCustMenu() {
        CustomerManager cm = new CustomerManager();
        boolean con = true;
        do {
            System.out.println("\t\t茶城管理系统>茶友信息管理");
            System.out.println("**********************************");
            System.out.println("\t\t1.显示所有茶友信息");
            System.out.println("\t\t2.添加茶友信息");
            System.out.println("\t\t3.修改茶友信息");
            System.out.println("\t\t4.查询茶友信息");
            System.out.println("***********************************");
            System.out.println("请选择,输入数字或'n'返回上级菜单");
            String choose = acceptInput("1", "2", "3", "4", "n");
            switch (choose) {
                case "1":
                    cm.setData(customers,goodses);
                    cm.showAllCustomer();
                    break;
                case "2":
                    cm.setData(customers,goodses);
                    cm.addCustomer();
                    break;
                case "3":
                    cm.setData(customers,goodses);
                    cm.modifyCustomer();
                    break;
                case "4":
                    cm.setData(customers,goodses);
                    cm.queryCustomer();
                    break;
                case "n":
                case "N":
                    con = false;
                    break;
            }
        } while (con);
        showMainMenu();
    }
}