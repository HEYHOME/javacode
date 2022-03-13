package daily.week1;

import java.util.Arrays;

/**
 * @description: 三角形的最大周长
 * @create: 2020-11-29-15:27
 * @author: Hey
 */
public class LargestPerimeter {
    public static void main(String[] args) {
        int[] A = {3,2,3};
        int i = largestPerimeter(A);
        System.out.println(i);
    }
    // 贪心+排序
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        for (int i = len-1; i >=2; i--) {
            if (A[i - 1] + A[i - 2] > A[i]) {
                return A[i - 1] + A[i - 2] + A[i];
            }
        }
        return 0;
    }
}
