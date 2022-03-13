package day03;

/**
 * @description:
 * @create: 2020-11-21-10:03
 * @author: Hey
 */
public class SelectProxy implements SelectSubject {
    private Select select = new Select();
    @Override
    public void selectUser() {
        preSelect();
        select.selectUser();
        postSelect();
    }

    @Override
    public void selectLog() {
        preSelect();
        select.selectLog();
        postSelect();
    }

    @Override
    public void selectSalary() {

    }

    public void preSelect(){
        System.out.println("预处理...");
    }
    public void postSelect(){
        System.out.println("后续处理...");
    }
}
