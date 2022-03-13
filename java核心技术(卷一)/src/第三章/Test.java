package 第三章;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author hey
 * @description
 * @create 2020-05-24-15:22
 */
public class Test {
    public static void main(String[] args) {
        /*int a = 123456789;
        float f = a;
        System.out.println(f);
        double x = 9.99;
        int nx = (int)x;
        int nnx = (int)Math.round(x);
        System.out.println(nx);
        System.out.println(nnx);*/
       /* String all = String.join(" ","hello","world","a","b");
        System.out.println(all);
        String repeated = "hello".repeat(3);
        System.out.println(repeated);
        System.out.println("--------------------------------");
        String str = "hello";
        String string = "hhello";
        int ans = str.compareTo(string);
        System.out.println(ans);
        int count = str.codePointCount(0,str.length());
        System.out.println(count);
        System.out.println(str.length());
        System.out.println("--------------------------------");
        StringBuilder builder = new StringBuilder();
        builder.append("he");
        builder.append("llo");
        builder.delete(0,1);
        String completedString = builder.toString();
        System.out.println(completedString);
        System.out.println("---------------------------------");*/
        /*Console cons = System.console();
        String username = cons.readLine("Username: ");
        char[] passwd = cons.readPassword("Password: ");
        System.out.println(username);
        System.out.println(passwd);*/
       /* double d = 10000000/3.0;
        System.out.printf("% .2f\n",d);
        System.out.printf("%,2f\n",d);
        int a = 165;
        System.out.printf("%#o\n",a);
        System.out.printf("%1$s %1$s\n",new Date());
        System.out.printf("%1$x %1$o",a);*/
        /*for (double i = 0; i !=10 ; i+=0.1) {
            System.out.println(i);
        }
        System.out.println("Blastoff");*/
        BigInteger a = BigInteger.valueOf(100);
        System.out.println(a);
        BigInteger reallyBig = new BigInteger("11111111111112444444444444444444");
        System.out.println(reallyBig);
        BigInteger b = BigInteger.ZERO;
        BigInteger a1=reallyBig.divide(a);
        System.out.println(a1);
        System.out.println(b);
        // var str = new int[];
        var r = 100;
        System.out.println(r);
        System.out.println("------------------------");
        String time = new Date().toString();
        System.out.println(time);
        System.out.println(new Date());
        System.out.println("-----------------------");
        LocalDate localDate =LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1 =LocalDate.of(1999,4,5);
        System.out.println(localDate1);
    }
}

