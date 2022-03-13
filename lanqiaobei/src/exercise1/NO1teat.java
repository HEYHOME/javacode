package exercise1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @create: 2020-12-27-13:19
 * @author: Hey
 */
public class NO1teat {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(.*)?");
        String str = "aaaaaaaa12121";
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }
}
