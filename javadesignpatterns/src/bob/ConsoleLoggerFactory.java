package bob;

/**
 * @description:
 * @create: 2020-11-05-18:44
 * @author: Hey
 */
public class ConsoleLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        Logger logger = new ConsoleLogger();
        return logger;
    }
}
