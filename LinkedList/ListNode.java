import java.util.*;

public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

class RevLinkList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        // ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
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
        // Create a sample linked list 1 -> 2 -> 3 -> 4 -> 5
        ListNode.head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Original list: ");
        printList(head);

        // Reverse it
        ListNode reversed = Solution.reverseList(head);
        System.out.println("Reversed: ");
        printList(reversed);
    }
}



/*
 * Can use 3 pointers
 * - prev = null
 * - curr = head
 * - next = null
 * While curr is not null:
 * - store next node of curr in next
 * - reverse the next ponter of curr to point to prev
 * - move prev to curr (for next iteration)
 * - move curr to next
 * Update the head
 * - at end of loop, prev will be the new head of the reversed list
 * Return prev as New Head



 */