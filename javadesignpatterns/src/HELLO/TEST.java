package HELLO;

/**
 * @description:
 * @create: 2020-10-10-13:58
 * @author: Hey
 */
public class TEST {
    public static void main(String[] args) {
        int[][] arr = new int[9][];
        // 动态分配列
        for (int i = 0; i < 9; i++) {
            arr[i] = new int[i+1];
        }
        // 数组赋值
        for (int i = 0; i < 9; i++) {
            for (int j = i; j <=8; j++) {
                arr[j][i]=(i+1)*(j+1);
            }

        }
        // 打印
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
