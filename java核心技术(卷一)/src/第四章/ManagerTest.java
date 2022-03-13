package 第四章;

/**
 * @author hey
 * @description
 * @create 2020-05-30-12:42
 */
public class ManagerTest {
    public static void main(String[] args) {
        var boss = new Manager("老板",5000,2000,1,1);
        boss.setBonus(1000);
        var staff = new Employee[3];
        staff[0]=boss;
        staff[1]=new Employee("小红",3000,2000,1,1);
        staff[2]=new Employee("小明",3000,2000,1,1);
        for (Employee e : staff) {
            e.raiseSalary(20);
            System.out.println(e.getSalary());
            System.out.println(e.toString());
        }
        if (staff[1] instanceof Manager) {
            boss = (Manager) staff[1];
            System.out.println("yes");
        }

    }
}
