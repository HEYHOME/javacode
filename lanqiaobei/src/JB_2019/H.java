package JB_2019;

import java.util.Scanner;

/**
 * @author hey
 * @description
 * @create 2020-07-14-0:45
 */
public class H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        in.nextLine();
        String text = in.nextLine();
        String[] words = text.split("\\s+|\\.");
        int[] wordsLength = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wordsLength[i] = words[i].length();
        }
        int num = 0;
        // Alice-->Bob 的距离
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Alice")) {
                for (int j = i+1; j < words.length; j++) {
                    int sum = 1;
                    if (words[j].equals("Bob")) {
                        for (int k = i+1; k < j; k++) {
                            sum+=wordsLength[k]+1;
                        }
                        if (sum <= K) {
                            num++;
                        }
                    }
                }
            }
        }
        // Bob-->Alice 的距离
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Bob")) {
                for (int j = i+1; j < words.length; j++) {
                    int sum = 1;
                    if (words[j].equals("Alice")) {
                        for (int k = i+1; k < j; k++) {
                            sum+=wordsLength[k]+1;
                        }
                        if (sum <= K) {
                            num++;
                        }
                    }
                }
            }
        }
        System.out.println(num);
    }
}
