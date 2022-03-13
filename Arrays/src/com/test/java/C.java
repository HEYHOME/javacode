package com.test.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author hey
 * @creat 2020-04-25-9:56
 */
public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        while(true){
            String str = sc.nextLine();
            // String[] str = sc.nextLine().split("");
            /*for (int i = 0; i < str.length; i++) {
                if (str[i]==" ") {
                    list.add(str.)
                }
            }*/
            if(str=="#"){
                return;
            }
            map.put(str,map.getOrDefault(str,0));
           /* if () {
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
*/

        }
    }
}
