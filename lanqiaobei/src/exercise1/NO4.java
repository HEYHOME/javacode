package exercise1;

/**
 * @description:
 * @create: 2020-12-27-13:59
 * @author: Hey
 */
public class NO4 {
    public static void main(String[] args) {
        int a = 51508732;
        int x = 0;
        for (int i = 0; i < 214746000; i++) {
            for (int j = 0; j < 21474600; j++) {
                double sum = a+i*i;
                double sum1=j*j;
                if (sum1==sum){
                    System.out.println(i);
                }
            }

        }
    }
}
