package 第七章;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author hey
 * @description
 * @create 2020-06-04-16:16
 */
public class LoggerTest {
    private static final Logger myLogger = Logger.getLogger("com.mycompany.myapp");// 调用getLogger方法,自定义的日志记录器

    public static void main(String[] args) {
        Logger.getGlobal().info("File->Open menu item selected");// 全局日志记录器
        // myLogger.setLevel(Level.ALL);
        myLogger.log(Level.INFO,"helloWorld");
        myLogger.log(Level.INFO,"hey");
    }
}
