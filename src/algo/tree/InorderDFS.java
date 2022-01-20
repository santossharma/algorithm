package algo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* Preorder traversal traverses Root first, then Left and Right nodes. Stack is used for it. */
public class InorderDFS {
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
        List<Integer> results = inOrderTraversal(treeNode);

        System.out.println(results);
    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        // traverses until last right node reached
        while(!stack.isEmpty() || node != null) {
            if(node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                result.add(node.value);
                node = node.right;
            }
        }

        return result;
    }

}
