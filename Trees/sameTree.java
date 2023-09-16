// https://leetcode.com/problems/same-tree/description/

public class sameTree {
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p == null || q == null) || (p.val != q.val)) return false;
        return  isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

    public static void main(String[] args) {
        
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        boolean result1 = isSameTree(p1, q1);
        System.out.println("Test Case 1: " + result1);

        // Test Case 2: Input: p = [1,2], q = [1,null,2]
        TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q2 = new TreeNode(1, null, new TreeNode(2));
        boolean result2 = isSameTree(p2, q2);
        System.out.println("Test Case 2: " + result2);

        // Test Case 3: Input: p = [1,2,1], q = [1,1,2]
        TreeNode p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        boolean result3 = isSameTree(p3, q3);
        System.out.println("Test Case 3: " + result3);

    }
}