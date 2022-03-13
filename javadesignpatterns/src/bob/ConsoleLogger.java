package bob;

/**
 * @description:
 * @create: 2020-11-05-18:41
 * @author: Hey
 */
public class ConsoleLogger implements Logger {

    @Override
    public void log() {
        System.out.println("控制台日志记录");
    }
}
