package Test;

/**
 * @description:
 * @create: 2020-10-10-14:57
 * @author: Hey
 */
public class Hello implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        Hello h1 = new Hello();
        Hello h2 = new Hello();
        new Thread(h1,"线程1").start();
        new Thread(h2,"线程2").start();
    }
}
