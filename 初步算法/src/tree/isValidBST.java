package tree;

import java.util.Stack;

/**
 * 验证二叉搜索树
 *
 * @author hey
 * @create 2020-05-12-21:44
 */
public class isValidBST {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        long inorder = Long.MIN_VALUE;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= inorder) {

                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}
