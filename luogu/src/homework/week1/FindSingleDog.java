package homework.week1;

import java.util.Scanner;

/**
 * @description: 找到单身汪
 * @create: 2020-11-28-19:18
 * @author: Hey
 */
public class FindSingleDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,2,3};
        FindSingleDog f = new FindSingleDog();
        int res = f.SingleDog(arr);
        System.out.println(res);
    }
    public int SingleDog(int[] arr){
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            res^=arr[i]; // 使用异或
        }
        return res;
    }
    /*public int SingleDog(int[] arr){
        int[] ans = new int[5];
        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]]++;
        }
        for (int i = 0; i < ans.length; i++) {
            if (ans[i]==1){
                return i;
            }
        }
        return 0;
    }*/
}
