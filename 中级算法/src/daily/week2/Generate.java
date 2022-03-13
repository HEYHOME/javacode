package daily.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 118. 杨辉三角
 * @create: 2020-12-06-12:35
 * @author: Hey
 */
public class Generate {
    public static void main(String[] args) {
        Generate g = new Generate();
        List<List<Integer>> lists = g.generate(3);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
    public List<List<Integer>> generate(int numRows) {
        int[][] arr = new int[numRows][numRows];
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = null;
        for (int i = 0; i < numRows; i++) {
            arr[i][0] = 1;
            list1 = new ArrayList<>();
            list1.add(arr[i][0]);
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i-1][j-1] +arr[i-1][j];
                list1.add(arr[i][j]);
            }
            list.add(list1);
        }
        return list;
    }
}
