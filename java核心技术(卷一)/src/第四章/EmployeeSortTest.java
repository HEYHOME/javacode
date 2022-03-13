package 第四章;

import java.util.Arrays;

/**
 * @author hey
 * @description
 * @create 2020-05-31-21:35
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        EmployeeSort[] staff = new EmployeeSort[3];
        staff[0] = new EmployeeSort("harry",6000);
        staff[1] = new EmployeeSort("marry",4000);
        staff[2] = new EmployeeSort("jack",4500);
        Arrays.sort(staff);
        for (EmployeeSort e : staff) {
            System.out.println("name="+e.getName()+",salary="+e.getSalary());
        }
    }
}
