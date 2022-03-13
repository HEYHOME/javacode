package daily.week2;

/**
 * @description: 计数质数
 * @create: 2020-12-03-13:40
 * @author: Hey
 */
public class CountPrimes {
    public static void main(String[] args) {

    }
    public int countPrimes(int n) {
        int count=0;
        for (int i = 2; i <n; i++) {
            if (isPrimes(i)){
                count++;
            }
            count+=isPrimes(i)?1:0;
        }
        return count;
    }

    public  boolean isPrimes(int x) {
        for (int i = 2; i*i<=x; i++) {
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
