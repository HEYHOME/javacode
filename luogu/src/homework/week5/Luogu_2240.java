package homework.week5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020-12-24-14:27
 * @author: Hey
 */
public class Luogu_2240 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 金币总数
        int V = sc.nextInt(); //背包总容量
        double sum=0;  //最大价值
        Node[] a = new Node[103];
        for (int i = 1; i <= N; i++) {
            a[i] = new Node();
           a[i].w = sc.nextInt();
           a[i].v = sc.nextInt();
           a[i].p = a[i].v/a[i].w;
        }
        // 降序输出
        Arrays.sort(a, 1, N + 1, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.p > o2.p) {
                    return -1;
                }else if (o1.p<o2.p){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        for (int i = 1; i <=N ; i++) {
            if (V >= a[i].w) {
                V-=a[i].w;
                sum+=a[i].v;
            }else {
                sum+=V*a[i].p;
                break;
            }
        }
        System.out.printf("%.2f",sum);
    }
}
class Node{
    double w;  //重量
    double v;  //价值
    double p;  //性价比
}