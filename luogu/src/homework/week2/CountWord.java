package homework.week2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description: P1308 统计单词数
 * @create: 2020-11-26-13:13
 * @author: Hey
 */
public class CountWord {

    public static void main(String[] args) {
        // 方法一
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String text = sc.nextLine();
        String t = "[a-zA-Z]+";
        int count=0;
        int index=-1;
        Pattern pattern = Pattern.compile(t);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            if (matcher.group().equalsIgnoreCase(word)) {
                if (index==-1){
                    index = matcher.start();
                }
                count++;
            }
        }
        if (count>0){
            System.out.println(count+" "+index);
        }else{
            System.out.println(index);
        }

        // 方法二
        /*Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = scanner.nextLine();
        String[] datas = text.split(" ");
        int count = 0;
        boolean flag = true;
        int location = 0;
        for (int i = 0; i < datas.length; i++) {
            if (datas[i].equalsIgnoreCase(word)) {
                count++;
                flag = false;
            }
            if (flag) {
                location += datas[i].length() + 1;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count + " " + location);
        }*/

    }
}
