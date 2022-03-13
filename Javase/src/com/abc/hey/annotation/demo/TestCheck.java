package com.abc.hey.annotation.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @description:
 * @create: 2020-12-03-10:05
 * @author: Hey
 */
public class TestCheck {

    public static void main(String[] args) throws IOException {
        //1.创建计算器对象
        Calculator c = new Calculator();
        //2.获取字节码文件对象
        Class<? extends Calculator> cls = c.getClass();
        //3.获取所有方法
        Method[] methods = cls.getMethods();

        int number=0;//出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            //4.判断方法上是否有Check注解
            if (method.isAnnotationPresent(Check.class)) {
                //5.有,执行
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //6.捕获异常,记录文件信息
                    number++;
                    bw.write(method.getName()+"方法出现异常");
                    bw.newLine();
                    bw.write("异常的名称: "+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因: "+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-----------------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现"+number+"次异常");
        bw.flush();
        bw.close();
    }
}
