package Test;

/**
 * @description:
 * @create: 2020-10-10-14:47
 * @author: Hey
 */
public class Student extends Person {
    private String course;
    private int num;
    private String name;
    Student(){
        course = "自由";
    }

    Student(String course) {
        this.course = course;
    }
    @Override
    public void print() {
        super.print();
        System.out.println(course);
    }


}
