package homework.week2;

import java.util.Scanner;

/**
 * @description: P1012 拼数
 * @create: 2020-11-30-21:10
 * @author: Hey
 */
public class luogu_1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]= sc.nextInt();
        }
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = nums[i]+"";
        }
        String temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if ((strings[j]+strings[i]).compareTo(strings[i]+strings[j])>0){
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        for (String s : strings) {
            System.out.print(s);
        }

    }

    /*public static String largestNumber(int[] nums){
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = nums[i]+"";
        }
        Arrays.sort(strings,new LargestNumberComparator());
        if (strings[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }

    private static class LargestNumberComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String order1 = o1+o2;
            String order2 = o2+o1;
            return order2.compareTo(order1);
        }
    }*/
}
