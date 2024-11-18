import java.util.*;
// not importing the ListNode since it's in the same directory

class remNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println("Original:");
        printList(head);

        
        System.out.println("Removed nth node from end:");
        printList(head);
    }
}