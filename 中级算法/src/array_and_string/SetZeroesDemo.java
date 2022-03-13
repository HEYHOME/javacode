package array_and_string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hey
 * @description 矩阵置零
 * @create 2020-05-18-16:14
 */
public class SetZeroesDemo {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j]=0;
                }
            }
        }
        // 该方法不合理:在for循环里把未遍历的matrix的值赋值为0.
        /*for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {

                if (matrix[i][j] == 0) {
                    int k=i,l=j;
                    while (l < matrix[i].length - j) {
                        matrix[i][l]=0;
                        l++;
                    }
                    while (k < matrix.length - i) {
                        matrix[k][j]=0;
                        k++;
                    }
                }
            }
        }*/
    }
}
