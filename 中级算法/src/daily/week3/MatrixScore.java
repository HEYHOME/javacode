package daily.week3;

/**
 * @description: 861. 翻转矩阵后的得分
 * @create: 2020-12-07-13:32
 * @author: Hey
 */
public class MatrixScore {
    public static void main(String[] args) {
        int[][] A = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int res = matrixScore(A);
        System.out.println(res);
    }
    public static int matrixScore(int[][] A) {
        int m = A.length, n = A[0].length;
        int ret = m * (1 << (n - 1));

        for (int j = 1; j < n; j++) {
            int nOnes = 0;
            for (int i = 0; i < m; i++) {
                if (A[i][0] == 1) {
                    nOnes += A[i][j];
                } else {
                    nOnes += (1 - A[i][j]); // 如果这一行进行了行反转，则该元素的实际取值为 1 - A[i][j]
                }
            }
            int k = Math.max(nOnes, m - nOnes);
            ret += k * (1 << (n - j - 1));
        }
        return ret;
    }

}
