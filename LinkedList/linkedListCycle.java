import java.util.*;

public class linkedListCycle {
    public boolean hasCycle(ListNode head) {
        
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