package 第四章;

/**
 * @author hey
 * @description
 * @create 2020-05-30-16:33
 */
public class Test {
    public static void main(String[] args) {
        String s = "Ok";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode()+","+sb.hashCode());
        char x = s.charAt(0);
        char y = s.charAt(1);
        System.out.println((int)x*31+(int)y);
    }
}
