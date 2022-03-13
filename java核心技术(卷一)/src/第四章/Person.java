package 第四章;

/**
 * @author hey
 * @description
 * @create 2020-05-30-12:26
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name=name;
    }
    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
