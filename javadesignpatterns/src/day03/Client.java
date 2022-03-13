package day03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @create: 2020-11-21-10:28
 * @author: Hey
 */
public class Client {
    public static void main(String[] args) {
        SelectSubject sub =
                (SelectSubject) Proxy.newProxyInstance(SelectProxy.class.getClassLoader(),
                new Class[]{SelectSubject.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method,
                                         Object[] args) throws Throwable {
                        if (method.getName().equals("selectLog")){
                            System.out.println("前置增强");
                        }
                        Object invoke = method.invoke(new Select(), args);
                        if (method.getName().equals("selectLog")) {
                            System.out.println("后置增强");
                        }
                        return invoke;
                    }
                });
        sub.selectLog();
    }
}
