package tree;


/**
 * @author hey
 * @create 2020-05-12-21:31
 */
public class MaxDepthDemo {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight=maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val=x;
    }
}