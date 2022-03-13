package 第十二章;

/**
 * @author hey
 * @description
 * @create 2020-06-10-17:10
 */
public class Test01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {

            }
        }
        System.out.println(Thread.currentThread().getName()+":完成!");
    }

    public static void main(String[] args) {
        Test01 t = new Test01();
        new Thread(t).start();
    }
}
