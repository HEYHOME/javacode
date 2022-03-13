package others;

/**
 * @description:
 * @create: 2020-11-18-20:23
 * @author: Hey
 */
public class CanCompleteCircuit {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        /*
        暴力法:
            用i标记第i个加油站,用j来遍历绕圈,当i==j时,return i;
            否则,返回-1.
     */

        /*int len = gas.length;
        for (int i = 0; i < len; i++) {
            int j = i;
            int remain = gas[i] ;
            while (remain-cost[j] >= 0) {
                remain = remain - cost[j] + gas[(j + 1) % len];
                j = (j+1)%len;
                if (j == i) {
                    return i;
                }
            }
        }
        return -1;*/

        int remain = 0;
        int minRemain = Integer.MAX_VALUE;
        int minIndex = 0;
        int len = gas.length;
        for (int i = 0; i < len; i++) {
            remain += gas[i] - cost[i];
            if (remain < minRemain) {
                minRemain = remain;
                minIndex = i;
            }
        }
        return remain >= 0 ? (minIndex + 1)%len : -1;
    }
}
