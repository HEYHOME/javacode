package Test.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * @description:
 * @create: 2020-11-05-0:20
 * @author: Hey
 */
public class init {
    public static Properties getPro() throws Exception {
        Properties pro = new Properties();
        File f = new File("Logger.properties");
        if (f.exists()) {
            pro.load(new FileInputStream(f));
        }else{
            pro.setProperty("type","Test.demo.Logger");
            pro.store(new FileOutputStream(f),"LOGGER CLASS");
        }
        return pro;
    }
}
