package JB_2019;

/**
 * @author hey
 * @description 数的分解
 * 把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不包 含数字 2 和 4，
 * 一共有多少种不同的分解方法？
 * 注意交换 3 个整数的顺序被视为同一种方法，
 * 例如 1000+1001+18 和 1001+1000+18 被视为同一种
 * @create 2020-07-05-21:54
 */
public class D {
    public static void main(String[] args) {
        String i1,j1,k1;
        int count=0;
        for (int i = 1; i < 2019; i++) {
            for (int j = i+1; j < 2019; j++) {
                for (int k = j+1; k < 2019; k++) {
                    i1=i+"";
                    j1=j+"";
                    k1=k+"";
                    if (i + j + k == 2019&&check(i1,j1,k1)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);  // 40785
    }

    private static boolean check(String i1, String j1, String k1) {
        for (char c : i1.toCharArray()) {
            if (c=='2'||c=='4'){
                return false;
            }
        }
        for (char c : j1.toCharArray()) {
            if (c=='2'||c=='4'){
                return false;
            }
        }
        for (char c : k1.toCharArray()) {
            if (c=='2'||c=='4'){
                return false;
            }
        }
        return true;
    }

}
