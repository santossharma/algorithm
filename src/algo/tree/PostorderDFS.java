package algo.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* Preorder traversal traverses Left first, then Right and Root nodes.
Two Stack is used for it, one to traverse and another to maintain the order */
public class PostorderDFS {
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
        List<Integer> results = postOrderTraversal(treeNode);

        System.out.println(results);
    }

    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        if(root == null) return result;

        stack1.push(root);
        // traverses until last right node reached
        while(!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node); // final ordered stack

            if(node.left != null) { // push LEFT first
                stack1.push(node.left);
            }
            if(node.right != null) {
                stack1.push(node.right);
            }
        }

        while (!stack2.isEmpty()) {
            result.add(stack2.pop().value);
        }

        return result;
    }

}
