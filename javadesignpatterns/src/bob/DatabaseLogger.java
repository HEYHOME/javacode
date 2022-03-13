package bob;

/**
 * @description:
 * @create: 2020-11-05-18:40
 * @author: Hey
 */
public class DatabaseLogger implements Logger {

    @Override
    public void log() {
        System.out.println("数据库日志记录");
    }
}
