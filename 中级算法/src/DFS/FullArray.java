package DFS;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description: 单词游戏
 * @create: 2020-10-06-22:03
 * @author: Hey
 */
public class FullArray {
    public static void main(String[] args) {
        // 输入
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i+1;
        }
        permute(array,0);
    }

    public static void permute(int[] array, int start) {
        if (start == array.length) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = start; i < array.length; i++) {
                swap(array,start,i);
                permute(array,start+1);
                swap(array,start,i);
            }
        }
    }

    public static void swap(int[] array, int s, int i) {
        int temp = array[s];
        array[s] = array[i];
        array[i] = temp;
    }
}
