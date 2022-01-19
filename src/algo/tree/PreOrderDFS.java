package algo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* Preorder traversal traverses Root first, then Left and Right nodes. Stack is used for it. */
public class PreOrderDFS {
    public static void main(String[] args) {
        /*
        (1)
           \
           (2)
           /
         (3)
            Input: root = [1,null,2,3]
            Output: [1,2,3]
        */

        TreeNode leftNode = null;
        TreeNode thirdLevelLeftNode = new TreeNode(3, null, null);
        TreeNode secondLevelRightNode = new TreeNode(2, thirdLevelLeftNode, null);

        TreeNode treeNode = new TreeNode(1, leftNode, secondLevelRightNode);
        List<Integer> results = preOrderTraversal(treeNode);

        System.out.println(results);
    }

    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) return result;
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            result.add(temp.value);

            // push right first in stack as it can be pop last
            if(temp.right != null) {
                stack.push(temp.right);
            }
            // push left in stack as it has to be pop first (N L R)
            if(temp.left != null) {
                stack.push(temp.left);
            }
        }

        return result;
    }

}
