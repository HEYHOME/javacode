package JA_2019;

/**
 * @description: 试题A:平方和
 * 小明对数位中含有 2、0、1、9 的数字很感兴趣，在 1 到 40 中这样的数包 括 1、2、9、10 至 32、39 和 40，共 28
 * 个，他们的和是 574，平方和是 14362。 注意，平方和是指将每个数分别平方后求和。 请问，在 1 到 2019 中，所有这样的数的平方和是多少？
 * @create: 2020-07-16-18:14
 * @author: Hey
 *
 */
public class A {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 2019; i++) {
            if (check(i)) {
                sum += Math.pow(i, 2);
            }
        }
        System.out.println(
                "1111111111111111111111111111111111111111111111111111111");
        System.out.println(sum);  // 2658417853
    }

    private static boolean check(int i) {
        String s = i + "";
        for (char c : s.toCharArray()) {
            if (c == '2' || c == '0' || c == '1' || c == '9') {
                return true;
            }
        }
        return false;
    }
}
