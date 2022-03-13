package com.abc.hey.annotation;
@SuppressWarnings("all")
/**
 * @description:
 * @create: 2020-12-02-23:13
 * @author: Hey
 */

/**
 * JDK中预定义的一些注解
 *  * @override:检测被该注解标注的方法是否是继承自父类(接口)的
 *  * @Deprecated:该注解标注的内容,表示已过时,被弃用
 *  * @SuppressWarnings:压制警告
 *      * 一般传递参数all: @SuppressWarnings("all")
 */

public class AnnoDemo02 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){
        // 有缺陷
    }

    public void show2(){
        // 替换show1方法
    }
    public void demo(){
        show1();
    }
}
