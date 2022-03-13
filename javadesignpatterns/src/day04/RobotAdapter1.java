package day04;

/**
 * @description:
 * @create: 2020-11-28-13:10
 * @author: Hey
 */
public class RobotAdapter1 implements Target {

    private RobotAdaptee robot;
    public RobotAdapter1(){
        robot = new RobotAdaptee();
    }
    @Override
    public void request() {
        robot.cry();
        robot.move();
        dogCry();
        dogMove();
    }

    private void dogMove() {
        System.out.println("像狗一样跑");
    }

    private void dogCry() {
        System.out.println("像狗一样叫");
    }
}
