package com.test.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author hey
 * @description
 * @create 2020-05-15-11:44
 */
public class test01{
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myAddress = InetAddress.getLocalHost();
        System.out.println("my的InetAddress:"+myAddress);// DESKTOP-VKASEVG/192.168.1.104
        InetAddress baiDuAddress = InetAddress.getByName("www.baidu.com");
        System.out.println("baidu的InetAddress:"+baiDuAddress);
    }
}