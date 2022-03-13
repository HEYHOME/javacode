package Test;

/**
 * @description:
 * @create: 2020-10-10-14:46
 * @author: Hey
 */
public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println(name);
        System.out.println(age);
    }
}
