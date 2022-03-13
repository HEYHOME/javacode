package math;

/**
 * @description: 汉明距离
 * @create: 2020-08-23-17:12
 * @author: Hey
 */
public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance test = new HammingDistance();
        int res = test.hammingDistance(9,12);
        System.out.println(res);
        System.out.println(Integer.bitCount(1));
    }
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }

}
