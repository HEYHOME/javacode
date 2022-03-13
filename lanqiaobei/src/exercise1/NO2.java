package exercise1;

/**
 * @description:
 * @create: 2020-12-27-13:24
 * @author: Hey
 */
public class NO2 {
    public static void main(String[] args) {
        String s = "abcdefghijklmnop";
        String ss = "";
        for (int i = 0; i < 103; i++) {
            ss+=s;
        }
        char[] chars = ss.toCharArray();
        String anss="";
        do {
            StringBuilder ans = new StringBuilder();
            for (int i = 1; i < chars.length; i+=2) {
                ans.append(chars[i]);
            }
             anss = ans.toString();
            chars = anss.toCharArray();
        }while (anss.length()>3);
        System.out.println(anss);

    }
}
