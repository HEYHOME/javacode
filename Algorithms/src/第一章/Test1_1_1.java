package 第一章;

/**
 * @author hey
 * @description 1.1.1-1.1.8
 * @create 2020-05-29-20:49
 */
public class Test1_1_1 {
    public static void main(String[] args) {
        System.out.println(2.0e-6 * 100000000.1);// 200.0000002
        System.out.println(true && false || true && true);// true
        System.out.println(1 + 2 + "3");// 33 String类型
        System.out.println((1 + 2.236) / 2);// 1.618 double类型
        System.out.println("-----------------------------");
        double d = Math.log10(1000);
        System.out.println(d);
        // 典型的数组处理代码
        /*
        1.找到数组中的最大的元素
        double max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]) max=a[i];
        }
        2.计算数组元素的平均值,使用double类型,精确
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        double average=sum/a.length;
        3.复制数组
        int len = a.length;
        double[] d = new double[len];
        for(int i=0;i<len;i++){
            double[i]=a[i];
        }
        4.颠倒数组元素的顺序
        int len = a.length;
        for(int i=0;i<len/2;i++){
            double temp = a[i];
            a[i]=a[len-1-i];
            a[len-1-i]=temp;
        }
        5.矩阵相乘(方阵) a[][]*b[][]=c[][];
        矩阵相乘使用了三个for循环
        int len = a.length;
        double[][] c = new double[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;i<len;j++){
                for(int k=0;k<len;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
         */
    }
}
