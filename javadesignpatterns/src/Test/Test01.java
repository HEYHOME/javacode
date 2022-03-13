package Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @description:
 * @create: 2020-10-10-14:50
 * @author: Hey
 */
public class Test01 {
    public static void main(String[] args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Student s = new Student();
        Teacher t = new Teacher();
        int i = s.getClass().getModifiers();
        int j = Teacher.class.getModifiers();
        Field[] fields = s.getClass().getDeclaredFields();
        for (int k = 0; k < fields.length; k++) {
            System.out.println(fields[k]);
        }
        System.out.println("i: "+i);
        System.out.println("j: "+j);
        String s1 = Modifier.toString(i);
        String t1 = Modifier.toString(j);
        String s2 = Modifier.toString(6);
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        System.out.println("t1: "+t1);
        System.out.println(Class.forName("java.util.Scanner"));
        System.out.println(Student.class);
        System.out.println(s.getClass());
        System.out.println(s.getClass().getName());
    }
}
 class Teacher{

}