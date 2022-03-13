package 第四章;

/**
 * @author hey
 * @description
 * @create 2020-05-31-21:29
 */
public class EmployeeSort implements Comparable<EmployeeSort> {
    private String name;
    private double salary;

    public EmployeeSort(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(EmployeeSort o) {
        return Double.compare(salary,o.salary);
    }
}
