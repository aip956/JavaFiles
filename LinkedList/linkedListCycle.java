import java.util.*;

public class linkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {return false;}
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next // move slow by one
            fast = fast.next.next; // move fast by 2

            if (slow == fast) {
                return true; // Cycle detected
            }
        }   
        return false; // no cycle
    }

    public static void printList(ListNode list) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
        int pos = 1;

    }
}