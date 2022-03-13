package tree;

/**
 * @description: 完全二叉树的节点个数
 * @create: 2020-11-24-18:47
 * @author: Hey
 */
public class CountNodes {

    public int countNodes(TreeNode root) {
        if (root==null) return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
