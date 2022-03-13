package greedy;

/**
 * @author hey
 * @description
 * @create 2020-06-30-22:06
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog("狗", "草莓");
        dog.cry();
    }
}
abstract class Animal{
    String type;

    Animal(String string) {
        type = string;
    }
    public abstract void cry();
}

class Dog extends Animal{
    String name;

    Dog(String string, String name) {
        super(string);
        this.name = name;

    }
    @Override
    public void cry() {
        System.out.println("我是:"+type+"\n我的名字叫:"+name);
    }
}