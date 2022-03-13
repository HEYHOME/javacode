package day03;

/**
 * @description:
 * @create: 2020-11-21-10:01
 * @author: Hey
 */
public class Select implements SelectSubject {

    @Override
    public void selectUser() {
        System.out.println("验证用户的身份信息");
    }

    @Override
    public void selectLog() {
        System.out.println("记录查询日志");
    }

    @Override
    public void selectSalary() {
        System.out.println("查询用户的奖金");
    }
}
