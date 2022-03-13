package bob;

/**
 * @description:
 * @create: 2020-11-05-18:43
 * @author: Hey
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return  logger;
    }
}
