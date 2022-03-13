package com.abc.hey.test;

import com.abc.hey.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @description: Junit白盒测试
 * @create: 2020-12-02-0:11
 * @author: Hey
 */
public class CalculatorTest {
    /**
     * 释放资源方法:
     *  在所有测试方法执行完后,都会自动执行该方法
     *
     */
    @After // 修饰的方法会在测试方法执行之后被自动执行
    public void close(){
        System.out.println("close...");
    }
    /**
     * 初始化方法:
     *  用于资源申请,所有测试方法在执行之前都会先执行该方法
     */
    @Before  // 修饰的方法会在测试方法执行之前被自动执行
    public void init(){
        System.out.println("init...");
    }
    /**
     * 测试方法
     */
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        System.out.println("testAdd...");
        int res = c.add(1,2);
        Assert.assertEquals(3,res);
    }
}
