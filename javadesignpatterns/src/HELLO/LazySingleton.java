package HELLO;

/**
 * @description:
 * @create: 2020-10-25-23:28
 * @author: Hey
 */
public class LazySingleton {
    private LazySingleton instance = null;
    public LazySingleton(){}
    public  LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
            System.out.println("666");
        }else{
            System.out.println("单例对象已被创建");
        }
        return instance;
    }

}
