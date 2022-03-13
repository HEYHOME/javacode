package JB_2019;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author hey
 * @description 试题G:外卖店优先级
 * 【问题描述】 “饱了么”外卖系统中维护着 N 家外卖店，编号 1 ∼ N。
 * 每家外卖店都有 一个优先级，初始时 (0 时刻) 优先级都为 0。
 * 每经过 1 个时间单位，如果外卖店没有订单，则优先级会减少 1，最低减 到 0；
 * 而如果外卖店有订单，则优先级不减反加，每有一单优先级加 2。
 * 如果某家外卖店某时刻优先级大于 5，则会被系统加入优先缓存中；
 * 如果 优先级小于等于 3，则会被清除出优先缓存。 给定 T 时刻以内
 * 的 M 条订单信息，请你计算 T 时刻时有多少外卖店在优 先缓存中。
 * 【输入格式】 第一行包含 3 个整数 N、M 和 T。
 * 以下 M 行每行包含两个整数 ts 和 id，表示 ts 时刻编号 id 的外卖店收到 一个订单。
 * 【输出格式】
 * 输出一个整数代表答案。
 * 【样例输入】 2 6 6
 *            1 1
 *            5 2
 *            3 1
 *            6 2
 *            2 1
 *            6 2
 * @create 2020-07-06-19:24
 */
public class G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Set<Integer> set = new HashSet<>();
            int N = in.nextInt();
            int M = in.nextInt();
            int T = in.nextInt();
            int[][] orders = new int[M][2];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < 2; j++) {
                    orders[i][j] = in.nextInt();
                }
            }
            int[] priority = new int[N];
            int[] sign = new int[N];
            for (int i = 1; i <= T; i++) {  // 在每一次T時刻
                for (int j = 0; j < M; j++) {  // 处理在该时刻接到订单的店
                    if (i == orders[j][0]) {
                        priority[orders[j][1] - 1] += 2;
                        if (priority[orders[j][1] - 1] > 5&&!set.contains(orders[j][1]-1)) {
                            set.add(orders[j][1] - 1);
                        }
                        sign[orders[j][1] - 1] = 1;  // 并将其做标记
                    }
                }
                for (int j = 0; j < N; j++) {  // 处理在该时刻未接到订单的店
                    if (sign[j] == 0 && priority[j] > 0) {
                        priority[j]--;
                    }
                    if (priority[j] <= 3) {
                        set.remove(j);
                    }
                }
                sign = new int[N];  // 每一个时刻都需要更新标记
            }
            System.out.println(set.size());
        } catch (Exception e) {
            in.close();
        }

    }
}
