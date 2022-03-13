package tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @description:
 * @create: 2020-11-12-9:35
 * @author: Hey
 */
public class TreeDemo {
    private static String s;
    private static char[] str;
    private static int count=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeDemo td = new TreeDemo();
        s = sc.nextLine();
        str = s.toCharArray();
        BiTNode root = td.createBiTree();
        td.perOrderTraverse(root);
        int res = td.getMaxWidth(root);
        System.out.print(res);
        // 测试复制二叉树
       /* BiTNode newRoot = null;
        BiTNode newT = td.copy(root,newRoot);
        td.perOrderTraverse(newT);*/

        //测试二叉树深度
        /*int d = td.depth(root);
        System.out.println();
        System.out.println(d);*/

        // 测试二叉树的结点个数
        /*int count = td.nodeCount(root);
        System.out.println(count);*/
    }

    //计算二叉树结点的个数
    public int nodeCount(BiTNode T) {
        if (T==null){
            return 0;
        }else{
            return nodeCount(T.lchild)+nodeCount(T.rchild)+1;
        }
    }

    //计算二叉树的深度
    public int depth(BiTNode T) {
        if (T == null) {
            return 0;
        }else{
            int m = depth(T.lchild);
            int n = depth(T.rchild);
            if (m > n) {
                return m+1;
            }else{
                return n+1;
            }
        }
    }

    // 复制二叉树
    public BiTNode copy(BiTNode T, BiTNode newT) {
        if (T == null) {
            newT = null;
        }else {
            newT= new BiTNode();
            newT.data = T.data;
            newT.lchild=copy(T.lchild, newT.lchild);
            newT.rchild=copy(T.rchild, newT.rchild);
        }
        return newT;
    }

    //以先序遍历,遍历二叉链表
    public void perOrderTraverse(BiTNode root) {
        if (root != null) {
            System.out.print(root.data);
            perOrderTraverse(root.lchild);
            perOrderTraverse(root.rchild);
        }
    }

    // 以先序遍历创建二叉链表
    public BiTNode createBiTree() {
        BiTNode root = new BiTNode();
        if (str[count]=='#') {
            count++;
            root = null;
        } else {
            root.data = str[count++];
            root.lchild=createBiTree();
            root.rchild=createBiTree();
        }
        return root;
    }

    // 计算二叉树的最大宽度
    public int getMaxWidth(BiTNode root){
        if (root == null)
            return 0;
        Queue<BiTNode> queue = new ArrayDeque<>();
        int maxWidth = 1; // 最大宽度
        queue.add(root); // 入队

        while (true) {
            int len = queue.size(); // 当前层的节点个数
            if (len == 0)
                break;
            while (len > 0) {// 如果当前层，还有节点
                BiTNode t = queue.poll();
                len--;
                if (t.lchild != null)
                    queue.add(t.lchild); // 下一层节点入队
                if (t.rchild != null)
                    queue.add(t.rchild);// 下一层节点入队
            }
            maxWidth = Math.max(maxWidth, queue.size());
        }
        return maxWidth;
    }
}

class BiTNode {
    char data;
    BiTNode lchild, rchild;
}
