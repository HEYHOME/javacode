package com.abc.hey.annotation;

import java.lang.reflect.Method;

/**
 * @description: 注解能做配置properties文件的操作
 * @create: 2020-12-01-23:08
 * @author: Hey
 */
@Pro(className = "com.abc.hey.annotation.Demo01",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
       /*
            前提:不能改变该类的任何代码,可以创建任意类的对象,可以执行任意方法
        */
       //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.获取上面的注解对象
        // 其实就是在内存中生成了一个该注解接口的子类实现对象
        /*
            public class ProImpl implements Pro{
                  public String className(){
                    return "com.abc.hey.annotation.Demo01";
                  }
                  public String methodName(){
                    return "show";
                  }
            }
        */
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3.调用注解对象中定义的抽象方法,获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

        //3.加载该类进内存
        Class<?> cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.getDeclaredConstructor().newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
