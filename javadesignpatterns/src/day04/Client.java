package day04;

/**
 * @description:
 * @create: 2020-11-28-13:16
 * @author: Hey
 */
public class Client {

    public static void main(String[] args) {
        Target target = new RobotAdapter2();
        target.request();
    }
}
