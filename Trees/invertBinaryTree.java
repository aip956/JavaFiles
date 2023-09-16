

// * Definition for a binary tree node.
// https://leetcode.com/problems/invert-binary-tree/description/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class invertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
        
    }

    public static void main(String[] args) {
        // Create the input binary tree: [4,2,7,1,3,6,9]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Print the original tree
        System.out.println("Original tree:");
        printTree(root);

        // Invert the tree
        invertBinaryTree solution = new invertBinaryTree();
        TreeNode invertedRoot = solution.invertTree(root);

        // Print the inverted tree
        System.out.println("\nInverted tree:");
        printTree(invertedRoot);
    }

    // Helper method to print the tree (in-order traversal)
    private static void printTree(TreeNode root) {
        if (root == null) return;
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }
}