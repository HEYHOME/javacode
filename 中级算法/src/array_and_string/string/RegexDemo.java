package array_and_string.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @create: 2020-11-09-22:40
 * @author: Hey
 */
public class RegexDemo {
    public static void main(String[] args) {
        //String chunkIPv4 = "[0-9]|[1-9][0-9]|[1-9][0-9][0-9]";
        Pattern p = Pattern.compile("k");
        Matcher m1 = p.matcher("kjh");
        Matcher m2 = p.matcher("aaaaba");
        Pattern pattern = Pattern.compile("("+"[0-9]|[1-9][0-9]|[1-9][0-9][0" +
                "-9]"+"\\.){3}");
        Pattern pattern1 = Pattern.compile("[1-9]|[1-9][1-9]ood");
        System.out.println(pattern1.matcher("11ood").matches());
        boolean matches = pattern.matcher("111.111.1.").matches();
        System.out.println(matches);
        System.out.println(m1.matches());
        System.out.println(m2.lookingAt());
        System.out.print("\n");
    }
}
