import java.util.*;

class RevLinkList {
    public ListNode reverseList(ListNode head) {
        
    }

    public static void main(String[] args) {
        
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