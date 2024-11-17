import java.util.*;
// listnode is already imported; same dir

class reorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1. Find middle of list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half of the list
        ListNode prev = null, curr = slow.next;
        slow.next = null; // Disconnect the first half
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // 3. Merge the two halves
        ListNode first = head, second = prev;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    // Helper function to print
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println("Original list: ");
        printList(head);

        reorderList solution = new reorderList();
        solution.reorderList(head);
        System.out.println("Reordered list:");
        printList(head);
    }
}


/*
1. Find the middle
    The slow pointer stops at the middle node; this divides the list in two halves
2. Reverse the 2nd half
    The second halv of the list is reversed using iteration
3. Merge the 2 halves
    Alternate nodes from the 1st half and reversed 2nd half

 * You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 

Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000

 */