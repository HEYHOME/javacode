package greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description: 用最少数量的箭引爆气球
 * @create: 2020-11-22-10:20
 * @author: Hey
 */

/**
 * 思路:
 * 若下个气球开始坐标在当前气球的结束坐标前，则我们可以用一支箭一起引爆；
 * 若下个气球的开始坐标在当前气球的结束坐标后，则我们必须增加箭的数量。并跟踪下个气球的结束坐标。
 *
 * 算法：
 * 根据 x_end 将气球进行排序。
 * 初始化 first_end 为第一个气球结束的坐标 points[0][1]。
 * 初始化箭的数量 arrows = 1。
 * 遍历所有的气球：
 * 如果气球的开始坐标大于 first_end：
 * 则增加箭的数量。
 * 将 first_end 设置为当前气球的 x_end。
 * 返回 arrows.
 *
 */
public class FindMinArrowShots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] points = {{1,2},{3,4},{5,6},{7,8}};
        FindMinArrowShots f = new FindMinArrowShots();
        int minArrowShots = f.findMinArrowShots(points);
        System.out.println(minArrowShots);
    }
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points,(o1,o2)->Integer.compare(o1[1],o2[1]));
        int arrows = 1;
        int xStart, xEnd;
        int firstEnd = points[0][1];
        for (int[] p : points) {
            xStart = p[0];
            xEnd = p[1];
            if (xStart > firstEnd) {
                arrows++;
                firstEnd = xEnd;
            }
        }
        return arrows;
    }
}
