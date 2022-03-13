package homework;

/**
 * @description:
 * @create: 2020-11-27-13:28
 * @author: Hey
 */
public class demo {
    public static void main(String[] args) {
        char[] c = {'h','e','l','l','o'};
        reverseString(c);

    }
    public static void reverseString(char[] c){
        StringBuilder sb = new StringBuilder(String.valueOf(c));
        sb.insert(3,"world");
        String substring = sb.substring(3);
        System.out.println(substring);
        System.out.println(sb);
    }
}
