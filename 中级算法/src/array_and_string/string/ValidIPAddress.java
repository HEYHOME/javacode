package array_and_string.string;

/**
 * @description: 验证IP地址
 * @create: 2020-11-09-22:17
 * @author: Hey
 */

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 1.规定输入框架,规定输入的规范.
 * IPv4的数不以0开头,ipv6忽略大小写,忽略0开头,不能出现::.
 */
public class ValidIPAddress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ip = in.next();
        ValidIPAddress v = new ValidIPAddress();
        String ans = v.validIPAddress(ip);
        System.out.println(ans);
    }

    String chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    // Pattern pattern = Pattern.compile(chunkIPv4+".");
    Pattern pattenIPv4 =
            Pattern.compile("^("+chunkIPv4+"\\.){3}"+chunkIPv4+"$");
    String chunkIPv6 = "([0-9a-fA-F]{1,4})";
    Pattern pattenIPv6 =
            Pattern.compile("^(" + chunkIPv6 + "\\:){7}" + chunkIPv6 + "$");

    public String validIPAddress(String IP) {
        if (IP.contains(".")) {
            return (pattenIPv4.matcher(IP).matches()) ? "IPv4" : "Neither";
        } else if (IP.contains(":")) {
            return (pattenIPv6.matcher(IP).matches()) ? "IPv6" : "Neither";
        }
        return "Neither";

    }
}
