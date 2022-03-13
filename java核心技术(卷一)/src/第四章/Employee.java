package 第四章;

import java.time.LocalDate;

/**
 * @author hey
 * @description
 * @create 2020-05-30-12:41
 */
public class Employee extends Person {
    private static int nextId = 1;
    private double salary;
    private LocalDate hireDay;
    private int id;
    private double percent = 10;

    public Employee(String name, double s, int year, int month, int day) {
        super(name);
        salary = s;
        hireDay = LocalDate.of(year, month, day);
        id = 0;
    }

   /* public void tripleValue(double x) {
        percent =3*x;
    }*/


    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f",salary);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /*public static void main(String[] args) {
        var e = new Employee("赵六",2000,2001,2,2);
        e.setId();
        e.tripleValue(e.percent);
        System.out.println(e.percent);
        System.out.println(e.toString());
    }*/

    @Override
    public String toString() {
        return getClass().getName()+"Employee{" +
                "salary=" + salary +
                ", hireDay=" + hireDay +
                ", id=" + id +
                ", percent=" + percent +
                "} " + super.toString();
    }
}
