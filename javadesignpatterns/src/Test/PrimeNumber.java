package Test;

/**
 * @description:
 * @create: 2020-10-10-15:12
 * @author: Hey
 */
public class PrimeNumber {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        for (int i = 17; i <=3500 ;i++) {
            if (isPrime(i)) {
                if (i < 100&&flag1) {
                    System.out.println(i);
                    flag1 = false;
                }
                if (i > 100 && i < 1000 && flag2) {
                    System.out.println(i);
                    flag2 = false;
                }
                if (i > 1000 && flag3) {
                    System.out.println(i);
                    flag3 = false;
                }
            }

        }
    }

    public static boolean isPrime(int i){
        for (int j = 2; j*j <=i ; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
