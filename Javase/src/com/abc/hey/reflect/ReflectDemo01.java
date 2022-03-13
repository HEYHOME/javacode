package com.abc.hey.reflect;

import java.lang.reflect.Field;

/**
 * @description: 反射练习
 * @create: 2020-11-29-16:08
 * @author: Hey
 */

    /*
        Class对象功能:
            *获取功能:
            1.获取成员变量们
                * Field[] getFields() :获取所有public修饰的成员变量
                * Field getField(String name) :获取指定name的public修饰的成员变量

                * Field[] getDeclaredFields() : 获取所有的成员变量,不受限于修饰符
                * Field getDeclaredField(String name) : 获取指定name的成员变量,不受限于修饰符
            2. 获取构造方法们
                * Constructor<?>[] getConstructors()
                * Constructor<T> getConstructor(类<?>...parameterTypes)

                * Constructor<?>[] getDeclaredConstructors()
                * Constructor<T> getDeclaredConstructor(类<?>...parameterTypes)
            3. 获取成员方法们
                * Method[] getMethods()
                * Method getMethod(String name,类<?>...parameterTypes)

                * Method[] getDeclaredMethods()
                * Method getDeclaredMethod(String name,类<?>...parameterTypes)
            4. 获取类名
                * String getName()

        * Field:成员变量
            * 操作:
                1.设置值: void set(Object obj, Object value)
                2.获取值: Object get(Object obj)
                3.忽略访问权限修饰符的安全检查: setAccessible(true) 暴力反射
     */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        // Field[] getFields()
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);  // public java.lang.String Person.name
        }
        // Field getField(String name)
        Field name = personClass.getField("name" );
        System.out.println(name);
        // 获取值: Object get(Object obj)
        Person p = new Person();
        Object value = name.get(p);
        System.out.println(value);  // null
        System.out.println(p);  // Person{name='null', age=0, address='null', number=0}
        // 设置值: void set(Object obj, Object value)
        name.set(p,"小宝");
        System.out.println(p);  // Person{name='小宝', age=0, address='null', number=0}
        System.out.println("=========================");
        Field age = personClass.getDeclaredField("age");
        age.set(p,18);
        Field number = personClass.getDeclaredField("number"); // number:private
        // 忽略访问权限修饰符的安全检查
        number.setAccessible(true);  // 暴力反射
        number.set(p,10086);
        Field address = personClass.getDeclaredField("address");
        address.set(p,"中国");
        System.out.println(p);
    }
}
