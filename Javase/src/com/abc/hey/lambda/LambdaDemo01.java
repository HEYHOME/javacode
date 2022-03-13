package com.abc.hey.lambda;

/**
 * @description:
 * @create: 2020-12-03-10:58
 * @author: Hey
 */
/*
    Lambda表达式的标准格式:
        由三部分组成:
            1.一些参数
            2.一个箭头
            3.一段代码
        格式:
            (参数列表)->{}
        解释说明格式:
            ():接口中的抽象方法的参数列表,没有参数,就空着;有参数就写参数,多个参数用逗号隔开
            ->:传递的意思,把参数传递给方法体{}
            {}:重写接口的抽象方法的方法体
 */
public class LambdaDemo01 {
    public static void main(String[] args) {
        //使用匿名内部类的方式实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();
        //使用Lambda表达式实现多线程
        new Thread(()->
        {System.out.println(Thread.currentThread().getName()+"新线程创建了");}
        ).start();
    }
}
