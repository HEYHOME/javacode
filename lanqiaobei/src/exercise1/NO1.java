package exercise1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description:
 * @create: 2020-12-27-12:55
 * @author: Hey
 */
public class NO1 {
    public static void main(String[] args) {
        int[] num = {1890204118,341787668,233875339,1439600715,1591461486,
                1466203776, 2060232653,1427970005,2060042075,485417367,
                1050727680,1709913205};
        Node[] nums = new Node[12];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Node();
            nums[i].data = num[i];
            nums[i].number = i+1;
        }
        Arrays.sort(nums, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.data-o2.data;
            }
        });
        int target = 2147483647;

        int k=0;
        while (target>=0){
            target = target-nums[k].data;
            if (target>=0){
                System.out.println(nums[k].number);
            }
            k++;
        }
    }
}
class Node{
    int data;
    int number;
}