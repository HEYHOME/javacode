package bob;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @description:
 * @create: 2020-11-05-20:13
 * @author: Hey
 */
public class init {
    public static Properties getPro() throws Exception {
        Properties pro = new Properties();
        File file = new File("D:\\IDEA-workspace\\java\\exercise\\src\\bob" +
                "\\logger.properties");
        InputStream is = new FileInputStream(file);
        pro.load(is);
        return pro;
    }
}
