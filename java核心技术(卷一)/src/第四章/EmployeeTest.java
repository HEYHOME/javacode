package 第四章;

/**
 * @author hey
 * @description
 * @create 2020-05-28-11:33
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("张三", 3000, 2000, 1, 1);
        staff[1] = new Employee("李四", 4000, 2001, 1, 1);
        staff[2] = new Employee("王五", 5000, 2002, 1, 1);
        for (Employee e : staff) {
            e.raiseSalary(20);
        }
        for (Employee e : staff) {
            System.out.println(e.toString());
        }
    }
}

