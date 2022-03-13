package day01;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @description:
 * @create: 2020-11-08-17:11
 * @author: Hey
 */
public class Init {
    public static Object getInstance() throws Exception {
        Properties pro = new Properties();
        File file = new File("D:\\IDEA-workspace\\java\\exercise\\src\\day01" +
                "\\config.properties");
        InputStream is = new FileInputStream(file);
        pro.load(is);
        String key = "outcomeFactory";
        String className = pro.getProperty(key);
        Class<?> cls = Class.forName(className);
        Object obj = cls.newInstance();
        return obj;
    }
}
