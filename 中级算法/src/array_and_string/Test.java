package array_and_string;

/**
 * @author hey
 * @description
 * @create 2020-06-27-23:39
 */
public class Test {

    public static int a = 100;
    public static void main(String[] args) {
        Test.test();
        Test t = new Test();
        t.test();
        System.out.println(t.a);
        System.out.println(Test.a);
    }
    public static void test(){
        System.out.println("静态方法");
    }
}
