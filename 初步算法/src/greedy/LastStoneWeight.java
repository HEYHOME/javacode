package greedy;

import java.util.PriorityQueue;

/**
 * @description: 最后一块石头的重量
 * @create: 2020-07-17-20:17
 * @author: Hey
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(len, (o1,o2)->o2-o1);
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        while (maxHeap.size() >= 2) {
            Integer head1 = maxHeap.poll();
            Integer head2 = maxHeap.poll();
            maxHeap.add(head1-head2);
        }
        return maxHeap.poll();
    }

    public static void main(String[] args) {
        LastStoneWeight l = new LastStoneWeight();
        int[] stones = {2, 7, 4, 1, 8};
        int res = l.lastStoneWeight(stones);
        System.out.println(res);
    }
}
