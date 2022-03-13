package 第七章;

import java.util.Scanner;

/**
 * @author hey
 * @description
 * @create 2020-06-02-23:20
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        // int ans1 = t.div(5, 6);
        // int ans2 = t.div(5, 0);
        t.div();
        // System.out.println(ans1);
        // System.out.println(ans2);
        // t.array();
    }

    // 异常和断言的使用
    public void div() {
        var in = new Scanner(System.in);
        int i = in.nextInt();

        if (i % 3 == 0) {
            System.out.println("i%3=0");
        } else if (i % 3 == 1) {
            System.out.println("i % 3 == 1");
        } else {
            assert i >= 0 : i;
            System.out.println("hh");
        }
    }

    // 异常
   /* public void array() {
        try {
            int[] a = new int[3];
            Arrays.fill(a, 1);
            System.out.println(a[-1]);
            Test t1 = new Test();
            int ans1 = t1.div(5, 0);
            System.out.println(ans1);

        } catch (ArrayIndexOutOfBoundsException e) {
            // e.printStackTrace();// 堆栈轨迹里包含了错误信息和对象的世界类型
            System.out.println(e.getMessage());// 得到详细的错误信息
            System.out.println(e.getClass().getName());// 得到对象的实际类型
            System.out.println("发生异常了");
        } catch (TestException e) {
            e.printStackTrace();
            System.out.println("hhh");
        }
    }*/
}

// 自定义异常
/*
class TestException extends Exception {
    public TestException() {
    }

    public TestException(String gripe) {
        super(gripe);
        System.out.println("异常发生了");
    }
}*/
