package day02;

/**
 * @description:
 * @create: 2020-11-14-16:30
 * @author: Hey
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder1();
        Director director = new Director(builder);
        Player player = director.construct();
        player.show();
    }
}
