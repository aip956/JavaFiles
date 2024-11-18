import java.util.*;
// not importing the ListNode since it's in the same directory

class remNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Create a dummy node and set to point to end
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Step 2: Move the first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Step 3: Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Step 4: Remove the nth node
        second.next = second.next.next;

        // Return the head of the modified list
        return dummy.next;
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
        int n = 2;
        remNthNodeFromEnd solution = new remNthNodeFromEnd();

        System.out.println("Original:");
        printList(head);

        ListNode result = solution.removeNthFromEnd(head, n);
        System.out.println("Removed nth node from end:");
        printList(result);
    }
}

/*
 * Dummy Node: simplifies handling edge cases like removing first node
 * Two pointers: first moves n+1 stps ahead so that second is just before the node to remove when first reaches the end
 * Remove Node: The node to remove is skipped by changing th next pointer of the node before it
 * 
Input: head = [1, 2, 3, 4, 5], n = 2

Step 1:
Dummy list: [0, 1, 2, 3, 4, 5]
first moves 3 steps ahead (n + 1).
Step 2:
Move first and second until first reaches null.
Step 3:
second points to 3. Remove 4:
second.next = second.next.next;
Output:
[1, 2, 3, 5]
 */