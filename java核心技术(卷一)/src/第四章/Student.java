package 第四章;

/**
 * @author hey
 * @description
 * @create 2020-05-30-12:31
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major=major;
    }
    @Override
    public String getDescription() {
        return "a student majoring in "+major;
    }
}
