package 第一章;

/**
 * @author hey
 * @description
 * @create 2020-07-13-17:43
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "now I am the best!";
        int len = s.length();
        String longS = s.concat(" and you?");
        System.out.println(len);
        System.out.println(s);
        System.out.println(longS);
        String[] s1 = longS.split(" ");
        String s2 = "";
        for (int i = 0; i < s1.length; i++) {
             s2+=s1[i];
        }
        System.out.println(s2);
        System.out.println(s2.length());
        int index = s2.indexOf("a",1);
        System.out.println(index);
        String a = "jgsf";
        String b = "afdg";
        System.out.println(a.compareTo(b));
    }
}
