package math;

import java.util.Arrays;

/**
 * @author hey
 * @description
 * @create 2020-05-18-12:54
 */
public class CountPrimesDemo {

    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        for (int i = 2; i*i <n ; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j+=i) {
                    isPrime[j]=false;
                }
            }

        }
        int count=0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
