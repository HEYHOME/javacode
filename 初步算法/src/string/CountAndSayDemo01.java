package string;

/**
 * 外观数列
 *
 * @author hey
 * @creat 2020-05-10-23:39
 */
public class CountAndSayDemo01 {
    /**
     * 解题思路：
     * 找规律
     * 4->5分析，将4个每一位拆开看（个数+数字），4=1211 => 1=11，2=12，11=21，所以5=111221
     * 所以解题用循环，从1->n可求解出来
     */

    public static void main(String[] args) {
        CountAndSayDemo01 cas = new CountAndSayDemo01();
        String string = cas.countAndSay01(6);
        System.out.println(string);
    }

    public String countAndSay01(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder builder = new StringBuilder();//新建一个string类用于拼接
            char pre = str.charAt(0);//取第一个字符
            int count = 1;//统计有几个相同的
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == pre) {//后一个字符与前一个同
                    count++;
                } else {
                    builder.append(count).append(pre);//拼接count个pre
                    pre = c;//前缀等于不同处
                    count = 1;
                }
            }
            builder.append(count).append(pre);//拼接count个pre
            str = builder.toString();//转换为string
        }
        return str;
    }


}
