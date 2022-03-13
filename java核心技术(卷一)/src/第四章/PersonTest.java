package 第四章;

/**
 * @author hey
 * @description
 * @create 2020-05-30-12:38
 */
public class PersonTest {

    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0]=new Employee("jack",5000,2020,1,1);
        people[1] = new Student("marry", "computer science");
        for (Person p : people) {
            System.out.println(p.getName()+","+p.getDescription());
        }
    }
}
