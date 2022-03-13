package 第一章;

/**
 * @author hey
 * @description
 * @create 2020-07-13-16:04
 */
public class Counter {
    int count=0;
    Counter(String id) {
        System.out.println(id);
    }
    void increment(){
        count++;
    }
    int tally(){
        return count;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                '}';
    }
}
