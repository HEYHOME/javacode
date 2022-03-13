package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hey
 * @description
 * @create 2020-05-13-16:34
 */
public class LevelOrderDemo {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int curSize = q.size();
            LinkedList<Integer> subList = new LinkedList<>();
            for (int i = 0; i < curSize; i++) {
                TreeNode curr = q.poll();
                if (curr != null) {
                    subList.add(curr.val);
                    if (curr.left != null) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null) {
                        q.offer(curr.right);
                    }
                }
            }
            result.add(subList);
        }
        return result;
    }

}
