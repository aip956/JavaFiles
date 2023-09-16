// https://leetcode.com/problems/sort-list/

import java.util.*;

public class SortLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;
        }
    }

    public ListNode sortLL(ListNode head) {
        // if empty or only one node
        if (head == null || head.next == null) {
            return head;
        }
        boolean swapped;
        ListNode current = head;
        ListNode prev = null;

        do {
            swapped = false;
            current = head;

            while (current != null && current.next !=null) {
                if (current.val > current.next.val) {
                    // swap
                    int temp = current.val;
                    current.val = current.next.val;
                    current.next.val = temp;
                    swapped = true;
                }
                prev = current;
                current = current.next;
            }
        } while(swapped);

        return head;
    }


    public static void main(String[] args) {
        SortLinkedList sorted = new SortLinkedList();

        // Create the list
        ListNode head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);
        
        // sort the list
        ListNode sortedList = sorted.sortLL(head);

        // print
        ListNode current = sortedList;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

