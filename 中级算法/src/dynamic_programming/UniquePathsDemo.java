package dynamic_programming;

import java.util.Arrays;

/**
 * @author hey
 * @description
 * @create 2020-05-19-20:36
 */
public class UniquePathsDemo {
    public int uniquePaths(int m, int n) {
        int[] cur = new int[n];
        Arrays.fill(cur,1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j <n ; j++) {
                cur[j] += cur[j - 1];
            }
        }
        return cur[n - 1];
    }
}
