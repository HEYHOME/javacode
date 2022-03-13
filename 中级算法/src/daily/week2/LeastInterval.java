package daily.week2;

import java.util.Scanner;

/**
 * @description: 621. 任务调度器
 * @create: 2020-12-05-11:11
 * @author: Hey
 */
public class LeastInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] tasks = new char[str.length()];
        int n = sc.nextInt();
        for (int i = 0; i < str.length(); i++) {
            tasks[i] = str.charAt(i);
        }
        LeastInterval l = new LeastInterval();
        int res = l.leastInterval(tasks, n);
        System.out.println(res);
    }
    public int leastInterval(char[] tasks, int n) {
        int[] temp = new int[26];
        int maxTask=0;
        int countMaxTask=0;
        for (char c : tasks) {
            temp[c-'A']++;
            maxTask = Math.max(temp[c-'A'],maxTask);
        }
        for (int i = 0; i < 26; i++) {
            if (temp[i] == maxTask) {
                countMaxTask++;
            }
        }
        return Math.max(tasks.length,(maxTask-1)*(n+1)+countMaxTask);
    }
}
