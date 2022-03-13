package HELLO;

/**
 * @description:
 * @create: 2020-10-10-14:06
 * @author: Hey
 */
public class Round {
    private final double PI = 3.14159;
    private  double r;
    public static void main(String[] args) {
        Round test = new Round();
        double per = test.perimeter();
        double a = test.area();
        System.out.println(per);
        System.out.println(a);

        Round test2 = new Round(3);
        double per2 = test2.perimeter();
        double a2 = test2.area();
        System.out.println(per2);
        System.out.println(a2);
    }

    Round() {
        r=1;
    }
    Round(double r) {
        this.r = r;
    }

    public double perimeter() {
        return 2*r*PI;
    }

    public double area() {
        return r*r*PI;
    }
}
