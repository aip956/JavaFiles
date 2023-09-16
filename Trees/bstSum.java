

public class bstSum {
    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    
        public int sum() {
            int sum = data;
            if (left != null) {
                sum += left.sum();
            }
            
            if (right != null) {
                sum += right.sum();
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        // Our example tree looks like this:
        //         2
        //       /   \
        //      3     4
        //     / \
        //    5   6

        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node2.left = node3;
        node2.right = node4;
        node3.left = node5;
        node3.right = node6;

        System.out.println("Sum of all values of this tree is (should print 20):");
        System.out.println(node2.sum());
    }
}
