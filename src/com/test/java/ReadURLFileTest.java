package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author hey
 * @description
 * @create 2020-06-15-17:19
 */
public class ReadURLFileTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String str;
        while ((str = in.readLine()) != null) {
            System.out.println(str);
        }
        in.close();
    }
}
