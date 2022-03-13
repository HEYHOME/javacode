package array_and_string.string;

import java.util.Scanner;

/**
 * @description: 整数转罗马数字
 * @create: 2020-11-22-8:51
 * @author: Hey
 */
public class IntToRoman {
    public static void main(String[] args) {
        IntToRoman itr = new IntToRoman();
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        String s = itr.intToRoman(num);
        System.out.println(s);
    }
    // 贪心算法
    public String intToRoman(int num) {
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V",
                "IV","I"};
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index < 13) {
            while (num>=nums[index]){
                sb.append(roman[index]);
                num-=nums[index];
            }
            index++;
        }
        return sb.toString();
    }
}
