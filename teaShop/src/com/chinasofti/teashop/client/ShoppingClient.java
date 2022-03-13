package com.chinasofti.teashop.client;

import com.chinasofti.teashop.db.DB;
import com.chinasofti.teashop.ui.Menu;

import java.util.Scanner;

/**
 * @author hey
 * @description
 * @create 2020-06-16-9:12
 */
public class ShoppingClient {
    public static void main(String[] args) {
        DB db = new DB();
        Menu menu = new Menu();
        menu.setData(db.customers, db.goodses);
        menu.showLoginMenu();
        String choose = menu.acceptInput("1", "2", "3");
        switch (choose) {
            case "1":
                for (int i = 1; i <= 3; i++) {
                    Scanner in = new Scanner(System.in);
                    System.out.print("请输入用户名: ");
                    String inputName = in.next();
                    System.out.print("请输入密码: ");
                    String inputPwd = in.next();
                    if (inputName.equals(db.manager.getName()) && inputPwd.equals(db.manager.getPassword())) {
                        menu.showMainMenu();
                        break;
                    } else if (i != 3) {
                        System.out.println("用户名和密码输入错误,请重新输入");
                    } else {
                        System.out.println("您输入的密码超过三次,请联系管理员,谢谢");
                    }

                }
                break;
            case "2":
                System.out.println("修改");
                break;
            case "3":
                System.out.println("退出");
                break;
        }
    }
}
