package DFS;

import java.util.List;

/**
 * @description: N叉树的最大深度
 * @create: 2020-11-22-19:23
 * @author: Hey
 */
public class MaxDepth {
    public int maxDepth(Node root) {
        if (root==null){
            return 0;
        }
        int result = 1;
        for (Node child : root.children) {
            result = Math.max(result,1+maxDepth(child));
        }
        return result;
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
