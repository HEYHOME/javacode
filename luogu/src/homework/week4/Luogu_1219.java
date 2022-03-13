package homework.week4;

import java.util.Scanner;

/**
 * @description: P1219 [USACO1.5]八皇后 Checker Challenge
 * @create: 2020-12-14-17:07
 * @author: Hey
 */
public class Luogu_1219 {
    static int[] queen;
    static int count = 0;
    static int n;
    static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        queen = new int[n];
        nums = new int[n];
        queens(0);
        System.out.println(count);
    }

    public static void queens(int row) {
        for (int col = 0; col < n; col++) {
            if (check(row, col)) {
                queen[row] = col;
                nums[row] = col+1;
                if (row == n-1) {
                    count++;
                    queen[row] = 0;
                    if (count<=3){
                        for (int num : nums) {
                            System.out.print(num+" ");
                        }
                        System.out.println();
                    }
                    //Arrays.fill(nums,0);
                    return;
                }
                queens(row + 1);
                queen[row] = 0;
            }

        }
    }

    private static boolean check(int row, int col) {
        for (int index = 0; index < row; index++) {
            int data = queen[index];
            if (data == col) {
                return false;
            }
            if (data + index == col + row) {
                return false;
            }
            if (index - data == row - col) {
                return false;
            }
        }
        return true;
    }
}
