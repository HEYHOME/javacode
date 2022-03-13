package greedy;

/**
 * @description: 玩筹码
 * 这里的chips数组里存放的是第i个筹码存放的位置，不是第i个位置存放了多少个筹码
 * @create: 2020-11-22-17:27
 * @author: Hey
 */
public class MinCostToMoveChips {
    public static void main(String[] args) {
        MinCostToMoveChips m = new MinCostToMoveChips();
        int[] position = {1,10,5,2,1,1};
        int i = m.minCostToMoveChips(position);
        System.out.println(i);
    }
    public int minCostToMoveChips(int[] position) {
        int odd=0;
        int even=0;
        for (int num : position) {
            int x = num&1;  // 判断x的奇偶性
            if (x==0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(odd,even);
    }
}
