package algo.tree;

/* Leetcode 297. Serialize and Deserialize Binary Tree
    Serialization is the process of converting a data structure or object into a sequence of bits
    so that it can be stored in a file or memory buffer, or transmitted across a network connection
    link to be reconstructed later in the same or another computer environment.

    Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your
    serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be
    serialized to a string and this string can be deserialized to the original tree structure.

 */
public class SerializeAndDeserializeBinaryTree {
    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree ser = new SerializeAndDeserializeBinaryTree();
        SerializeAndDeserializeBinaryTree deser = new SerializeAndDeserializeBinaryTree();

        TreeNode leftNode = null;
        TreeNode thirdLevelLeftNode = new TreeNode(3, null, null);
        TreeNode secondLevelRightNode = new TreeNode(2, thirdLevelLeftNode, null);

        TreeNode root = new TreeNode(1, leftNode, secondLevelRightNode);

        TreeNode result = deser.deserialize(ser.serialize(root));

    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        return null;//todo
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        return null;//todo
    }
}
