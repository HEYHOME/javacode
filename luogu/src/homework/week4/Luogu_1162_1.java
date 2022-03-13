package homework.week4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020-12-21-21:05
 * @author: Hey
 */
public class Luogu_1162_1 {
    public static int[][] paint;
    public static boolean[][] vis;//判断是否检测过了
    public static int [][]dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};//二维数组记录方向
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        paint = new int[40][40];
        vis = new  boolean[40][40];
        vis[0][0]=true;
        //获取输入
        for(int i=1;i<=n;i++){  //这里必须要在外面多一圈保证是联通图更好的搜索
            for(int j=1;j<=n;j++){
                paint[i][j] = scanner.nextInt(); //赋值完成
            }
        }
        //创建队列，由于使用BFS所以使用队列
        Queue<Integer> x = new LinkedList<Integer>();
        Queue<Integer> y = new LinkedList<Integer>();
        x.offer(0);y.offer(0);//从0，0开始搜索
        while(!x.isEmpty()){//如果队列不为空就继续下去
            for(int i=0;i<4;i++){//四个方向搜索
                int dx = x.element()+dir[i][0];//获得当前元素位置加上下一个访问的位置
                int dy = y.element()+dir[i][1];
                if(dx>=0&&dx<=n+1&&dy>=0&&dy<=n+1&&paint[dx][dy]==0&&!vis[dx][dy]){
                    //未被访问过的外层的0元素,将其状态标记为访问过并且压进去，后面会用这个找下面的值
                    x.offer(dx);
                    y.offer(dy);
                    vis[dx][dy] = true;
                }
            }
            //将队首弹出，这样符合BFS的核心思想
            x.poll();
            y.poll();
        }
        //到这里就彻底的搞定了，只需要输出就可以了，因为我们的外层都被标记了,这里输出必须要排除外圈的一层0
        for(int i=1;i<=n;i++){  //这里必须要在外面多一圈保证是联通图更好的搜索
            for(int j=1;j<=n;j++){
                if(paint[i][j]==0&&!vis[i][j]){
                    //任然是0，而且还没有被标记到
                    System.out.print(2+" ");//表示是内圈的0，所以输出2
                }else{
                    //正常的输出原来的元素
                    System.out.print(paint[i][j]+" ");
                }
            }
            System.out.println();
        }
    }


}
