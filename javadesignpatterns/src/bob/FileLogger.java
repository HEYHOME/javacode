package bob;

/**
 * @description:
 * @create: 2020-11-05-18:39
 * @author: Hey
 */
public class FileLogger implements Logger {

    @Override
    public void log() {
        System.out.println("文件日志记录");
    }
}
