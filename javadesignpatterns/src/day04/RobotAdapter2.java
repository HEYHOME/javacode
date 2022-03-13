package day04;

/**
 * @description:
 * @create: 2020-11-28-13:13
 * @author: Hey
 */
public class RobotAdapter2 implements Target {
    private RobotAdaptee robot;
    public RobotAdapter2(){
        robot = new RobotAdaptee();
    }
    @Override
    public void request() {
        robot.cry();
        robot.move();
        birdCry();
        birdFly();
    }

    private void birdCry() {
        System.out.println("像鸟一样叫");
    }

    private void birdFly() {
        System.out.println("像鸟一样飞");
    }
}
