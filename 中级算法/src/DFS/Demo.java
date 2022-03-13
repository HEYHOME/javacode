package DFS;

import java.util.Scanner;

/**
 * @description:
 * @create: 2020-09-05-22:47
 * @author: Hey
 */
public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[][] nums = new float[3][2];
        float area=0;
        for (int i = 0; i < 3; i++) {
            nums[i][0] = in.nextFloat();
            nums[i][1] = in.nextFloat();
        }
        area=
                (float)(1.0/2.0)*(nums[0][0]*nums[1][1]+nums[1][0]*nums[2][1]+nums[2][0]*nums[0][1]
                -nums[0][0]*nums[2][1]-nums[1][0]*nums[0][1]-nums[2][0]*nums[1][1]);
        System.out.printf("%.2f",area);
    }
}
