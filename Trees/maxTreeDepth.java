
// https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/

public class maxTreeDepth {
    static class Node {
        int data;
        Node left, right;
     
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    public static int maxDepth(Node root) {
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));

        
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);
 
        System.out.println("Height of tree is " + maxDepth(root));
    }


    
}
