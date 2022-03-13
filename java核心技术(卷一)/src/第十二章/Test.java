package 第十二章;

/**
 * @author hey
 * @description
 * @create 2020-06-10-17:02
 */
public class Test{
    public static void main(String[] args) {
        Runnable r2 = ()->{
            for (int i = 0; i < 6; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    Thread.sleep((int) (Math.random() * 1000));
                } catch (InterruptedException e) {

                }
            }
            System.out.println(Thread.currentThread().getName()+":完成!");
        };
        Runnable r1 = ()->{
            for (int i = 0; i < 6; i++) {
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    Thread.sleep((int) (Math.random() * 1000));
                } catch (InterruptedException e) {

                }
            }
            System.out.println(Thread.currentThread().getName()+":完成!");
        };
        // new Thread(r2).start();
        r2.run();
        r1.run();
    }

}
