import java.util.*;

class ExamRoom {

        private TreeSet<Integer> occupiedSeats;
        private int n;

        public ExamRoom(int n) {
            this.n = n;
            this.occupiedSeats = new TreeSet<>();
        }
        

    
    public int seat() {
        if (occupiedSeats.isEmpty()) {
            occupiedSeats.add(0);
            return 0;
        }
        
        int maxDistance = occupiedSeats.first();  // Dist from start
        int startSeat = 0;
        int resultSeat = 0;

        // Iterate through the occup seats to find max dist
        for (int seat : occupiedSeats) {
            int distance = (seat - startSeat) / 2;
            if (distance > maxDistance) {
                maxDistance = distance;
                resultSeat = (seat + startSeat) / 2;
            }
            startSeat = seat;
        }

        // Check dist from the end
        if (n - 1 - occupiedSeats.last() > maxDistance) {
            resultSeat = n - 1;
        }
        // int newSeat = (occupiedSeats.last() - startSeat) / 2 + startSeat;
        occupiedSeats.add(resultSeat);
        return resultSeat;
    }
    
    public void leave(int p) {
        occupiedSeats.remove(p);
    }

    public static void main(String[] args) {
        ExamRoom examRoom = new ExamRoom(10);
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        examRoom.leave(4);
        System.out.println(examRoom.seat());
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(n);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */





/* 
 * https://leetcode.com/problems/exam-room/
 * // when seat, determine greatest distances
 * // it's the left - right / 2
 * 855. Exam Room
Medium
1.3K
461
Companies
There is an exam room with n seats in a single row labeled from 0 to n - 1.

When a student enters the room, they must sit in the seat that maximizes the distance to the closest person. If there are multiple such seats, they sit in the seat with the lowest number. If no one is in the room, then the student sits at seat number 0.

Design a class that simulates the mentioned exam room.

Implement the ExamRoom class:

ExamRoom(int n) Initializes the object of the exam room with the number of the seats n.
int seat() Returns the label of the seat at which the next student will set.
void leave(int p) Indicates that the student sitting at seat p will leave the room. It is guaranteed that there will be a student sitting at seat p.
 

Example 1:

Input
["ExamRoom", "seat", "seat", "seat", "seat", "leave", "seat"]
[[10], [], [], [], [], [4], []]
Output
[null, 0, 9, 4, 2, null, 5]

Explanation
ExamRoom examRoom = new ExamRoom(10);
examRoom.seat(); // return 0, no one is in the room, then the student sits at seat number 0.
examRoom.seat(); // return 9, the student sits at the last seat number 9.
examRoom.seat(); // return 4, the student sits at the last seat number 4.
examRoom.seat(); // return 2, the student sits at the last seat number 2.
examRoom.leave(4);
examRoom.seat(); // return 5, the student sits at the last seat number 5.

 

Constraints:

1 <= n <= 109
 */