package sort_and_search;

/**
 * @author hey
 * @description 最佳观光组合
 * 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。
 * 一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。
 * 返回一对观光景点能取得的最高分
 *      心得:关键发现A[i]+i与A[j]-j的值
 * @create 2020-06-17-21:53
 */
public class MaxScoreSightseeingPair {
    public static void main(String[] args) {
        int[] AA = {8,1,5,2,6};
        MaxScoreSightseeingPair m = new MaxScoreSightseeingPair();
        int maxAns = m.maxScoreSightseeingPair(AA);
        System.out.println(maxAns);
    }
    public int maxScoreSightseeingPair(int[] A) {
        int ans=0;
        int max = A[0]+0;
        for (int i = 1; i < A.length; i++) {
            ans = Math.max(ans,max+A[i]-i);
            max = Math.max(max,A[i]+i);
        }
        return ans;
    }
}
