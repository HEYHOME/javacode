package homework.week1;

import java.util.Scanner;

/**
 * @description: P1051 谁拿了最多奖学金
 * @create: 2020-11-30-19:47
 * @author: Hey
 */
public class luogu_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stu[] stus = new Stu[n];
        int sums=0;  // 这n个学生获得的奖学金的总数
        int max=0;  // 最多奖金的学生所获得的奖金总数
        int index=0;  // 记录最多奖金的学生
        for (int i = 0; i < n; i++) {
            stus[i] = new Stu();
            stus[i].name = sc.next();
            stus[i].lastAvg = sc.nextInt();
            stus[i].clsPy = sc.nextInt();
            stus[i].stuLeader = sc.next().charAt(0);
            stus[i].stuWest = sc.next().charAt(0);
            stus[i].thesisNum = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {

            if (stus[i].lastAvg>80&&stus[i].thesisNum>0) {
                sums+=8000;
                stus[i].scholarship+=8000;
            }
            if (stus[i].lastAvg>85&&stus[i].clsPy>80){
                sums+=4000;
                stus[i].scholarship+=4000;
            }
            if (stus[i].lastAvg>90){
                sums+=2000;
                stus[i].scholarship+=2000;
            }
            if (stus[i].lastAvg>85&&stus[i].stuWest=='Y'){
                sums+=1000;
                stus[i].scholarship+=1000;
            }
            if (stus[i].clsPy>80&&stus[i].stuLeader=='Y'){
                sums+=850;
                stus[i].scholarship+=850;
            }
            if (max<stus[i].scholarship){
                max = stus[i].scholarship;
                index = i;
            }
        }
        System.out.println(stus[index].name);
        System.out.println(stus[index].scholarship);
        System.out.println(sums);
    }
}
class Stu{
    String name;
    int lastAvg;
    int clsPy;
    char stuLeader;
    char stuWest;
    int thesisNum;
    int scholarship;
}
