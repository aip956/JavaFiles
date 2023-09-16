// https://leetcode.com/problems/subtree-of-another-tree/

public class subtreeOfAnother {
    static class TreeNode {
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

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if ((root == null) && (subRoot != null)) return false;
        if (sameTree(root, subRoot)) return true;
        return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }

    public static boolean sameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if ((root != null && subRoot != null) && (root.val == subRoot.val)) {
            return ((sameTree(root.left, subRoot.left)) && (sameTree(root.right, subRoot.right)));
        }
        return false;
    }
    public static void main(String[] args) {
        
        // Test Case 1: The subRoot tree [4,1,2] is a subtree of the root tree [3,4,5,1,2].
    TreeNode root1 = new TreeNode(3);
    root1.left = new TreeNode(4);
    root1.right = new TreeNode(5);
    root1.left.left = new TreeNode(1);
    root1.left.right = new TreeNode(2);

    TreeNode subRoot1 = new TreeNode(4);
    subRoot1.left = new TreeNode(1);
    subRoot1.right = new TreeNode(2);

    boolean result1 = isSubtree(root1, subRoot1);
    System.out.println("Test Case 1: " + result1);

    // Test Case 2: The subRoot tree [4,1,2] is not a subtree of the root tree [3,4,5,1,2,null,null,null,null,0].
    TreeNode root2 = new TreeNode(3);
    root2.left = new TreeNode(4);
    root2.right = new TreeNode(5);
    root2.left.left = new TreeNode(1);
    root2.left.right = new TreeNode(2);
    root2.left.left = new TreeNode(0);
    root2.left.left.right = null;
    root2.left.right.left = null;
    root2.left.right.right = null;
    root2.right.left = null;
    root2.right.right = null;

    TreeNode subRoot2 = new TreeNode(4);
    subRoot2.left = new TreeNode(1);
    subRoot2.right = new TreeNode(2);

    boolean result2 = isSubtree(root2, subRoot2);
    System.out.println("Test Case 2: " + result2);

    }


    
}
