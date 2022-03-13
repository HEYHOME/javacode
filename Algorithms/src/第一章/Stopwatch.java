package 第一章;

/**
 * @description:
 * @create: 2020-07-17-14:49
 * @author: Hey
 */
public class Stopwatch {
    private final long start;
    public Stopwatch(){
        start=System.currentTimeMillis();
    }

    public double elapsedTime() {
        long  now =System.currentTimeMillis();
        return (now-start)/1000.0;
    }
}
