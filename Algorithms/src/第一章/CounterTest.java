package 第一章;

/**
 * @author hey
 * @description
 * @create 2020-07-13-16:10
 */
public class CounterTest {
    public static void main(String[] args) {
        Counter[] rolls = new Counter[3];
        for (int i = 0; i <3 ; i++) {
            rolls[i] = new Counter(i + "'s");
            System.out.println(rolls[i]);
        }
    }

    public static Counter max(Counter x, Counter y) {

        if (x.tally() > y.tally()) {
            System.out.println("x");
            return x;
        }
        else {
            System.out.println("y");
            return y;
        }
    }
}
