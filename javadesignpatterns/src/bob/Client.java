package bob;

import java.util.Properties;

/**
 * @description:
 * @create: 2020-11-05-18:50
 * @author: Hey
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Logger logger;
        LoggerFactory lf;
        Properties pro = init.getPro();
        String key = "consoleLoggerFactory";
        String className = pro.getProperty(key);
        Class<?> cls = Class.forName(className);
        lf = (LoggerFactory) cls.newInstance();
        logger = lf.createLogger();
        logger.log();
    }
}
