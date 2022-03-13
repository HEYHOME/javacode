package com.chinasofti.teashop.manager;

import com.chinasofti.teashop.bean.Customer;
import com.chinasofti.teashop.bean.Goods;
import com.chinasofti.teashop.ui.Menu;

import java.util.Scanner;

/**
 * @author hey
 * @description
 * @create 2020-06-18-15:16
 */
public class CustomerManager {
    private Customer[] customers;
    private Goods[] goodses;

    public void setData(Customer[] customers, Goods[] goodses) {
        this.customers = customers;
        this.goodses = goodses;
    }

    Scanner in = new Scanner(System.in);

    // 显示所有茶友信息
    public void showAllCustomer() {
        System.out.println("茶友信息管理>显示茶友信息列表");
        System.out.println("茶友号\t生日\t积分\t");
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == 0) {
                break;
            }
            System.out.println(customers[i].getId() + "\t" + customers[i].getBirthday() + "\t" + customers[i].getScore());
        }
        System.out.println("按'n'返回上一级菜单");
        Menu menu = new Menu();
        menu.setData(customers, goodses);
        String choose = menu.acceptInput("n");
        if (choose.equalsIgnoreCase("n")) {
            menu.showCustMenu();
        }
    }

    // 添加茶友信息
    public void addCustomer() {
        System.out.println("茶友信息管理>显示茶友信息列表>添加茶友信息");
        int index = -1;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == 0) {
                index = 1;
                break;
            }
        }
        System.out.print("请输入茶友号(<5位整数>): ");
        int id = in.nextInt();// 判断输入的不是数字或五位怎么办,茶友号冲突怎么办

        System.out.print("请输入茶友生日(月/日<请使用两位整数>): ");
        String birthday = in.next(); // 不是两位数,月不是1-12,日不是1-31怎么办
        System.out.print("请输入茶友积分:");
        int score = in.nextInt();
        customers[index].setId(id);
        customers[index].setBirthday(birthday);
        customers[index].setScore(score);

        System.out.println("按'n'返回上一级菜单.");
        Menu menu = new Menu();
        menu.setData(customers, goodses);
        String choose = menu.acceptInput("n");
        if (choose.equalsIgnoreCase("n")) {
            menu.showCustMenu();
        }
    }

    // 修改茶友信息
    public void modifyCustomer() {
        System.out.println("茶友信息管理>显示茶友信息列表>修改茶友信息");
        System.out.print("请输入您的茶友号: ");
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        System.out.println("\t茶友号   生日   积分");
        System.out.println("\t------|------|------");
        int index = -1;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == id) {
                System.out.println(customers[i].getId() + "\t" + customers[i].getBirthday() + "\t" + customers[i].getScore());
                index = 1;
                break;
            }
        }
        if (index != -1) {
            while (true) {
                System.out.println("*********************************");
                System.out.println("\t可修改的茶友信息如下:");
                System.out.println("\t\t1.修改茶友生日");
                System.out.println("\t\t2.修改茶友积分");
                System.out.println("**********************************");
                System.out.print("请输入序号: ");
                switch (in.nextInt()) {
                    case 1:
                        System.out.print("请输入修改后的生日:");
                        customers[index].setBirthday(in.next());
                        System.out.println("生日信息修改成功");
                        break;
                    case 2:
                        System.out.print("请输入修改后的积分:");
                        customers[index].setScore(in.nextInt());
                        System.out.println("积分修改成功");
                        break;
                }

                System.out.print("是否修改其他属性(y/n): ");
                // System.out.println("按'n'返回上一级菜单.");
                String flag = in.next();
                if ("n".equalsIgnoreCase(flag)) {
                    break;
                }
            }
            Menu menu = new Menu();
            menu.setData(customers, goodses);
            menu.showCustMenu();
        } else {
            System.out.println("抱歉,没有您要查询的茶友");
        }
    }

    // 查询茶友信息
    public void queryCustomer() {
        System.out.println("茶友信息管理>显示茶友信息列表>查询茶友信息");
        String con = "y";
        Scanner in = new Scanner(System.in);
        while ("y".equals(con)) {
            System.out.print("请输入茶友号: ");
            int id = in.nextInt();
            boolean isExitUser = false;
            for (int i = 0; i < customers.length; i++) {
                if (customers[i].getId() == id) {
                    System.out.println("茶友号\t生日\t积分");
                    System.out.println(customers[i].getId() + "\t" + customers[i].getBirthday() + "\t" + customers[i].getScore());
                    isExitUser = true;
                    break;
                }
            }
            if (!isExitUser) {
                System.out.println("抱歉,没有您查询的茶友号");
            }
            System.out.print("还需继续查询吗(y/n): ");
            // System.out.println("按'n'返回上一级菜单.");
            con = in.next();
        }
        Menu menu = new Menu();
        menu.setData(customers, goodses);
        menu.showCustMenu();

    }
}
