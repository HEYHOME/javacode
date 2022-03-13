package Test;

/**
 * @description:
 * @create: 2020-10-24-14:48
 * @author: Hey
 */
public class Demo01 {
    public static int count=0;
    public static void main(String[] args) {
        int res = fact(4);
        System.out.println(res);
        System.out.println(count);
    }

    public static int fact(int n) {
        if (n <= 0) {
            return 1;
        }else{
            count++;
            return fact(n-1)*n;
        }
    }
}
