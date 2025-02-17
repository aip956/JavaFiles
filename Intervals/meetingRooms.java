import java.util.*;

class Interval {
    int start;
    int end;

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

class meetingRooms {
    public static boolean canAttend(List<Interval> intervals) {
        // System.out.println(intervals.size());
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start > intervals.get(i-1).start && (intervals.get(i).start < intervals.get(i-1).end)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Interval> intervals1 = Arrays.asList(
            new Interval(0,30),
            new Interval(5,10), // intervals.get(1).start, .end
            new Interval(15,20)
        );
        System.out.println("Can Attend: " + canAttend(intervals1));

        List<Interval> intervals2 = Arrays.asList(
            new Interval(5, 8),
            new Interval(9, 15) // true
        );
        System.out.println("Can Attend: " + canAttend(intervals2));

    }
}








/*
 * Meeting Rooms
 * should sort first, then compare 2nd start < 1st end
 * 
 * 
Given an array of meeting time interval objects consisting 
of start and end times [[start_1,end_1],[start_2,end_2],...] 
(start_i < end_i), determine if a person could add all 
meetings to their schedule without any conflicts.

Example 1:

Input: intervals = [(0,30),(5,10),(15,20)]

Output: false
Explanation:

(0,30) and (5,10) will conflict
(0,30) and (15,20) will conflict

Example 2:
Input: intervals = [(5,8),(9,15)]
Output: true
Note:

(0,8),(8,10) is not considered a conflict at 8
Constraints:

0 <= intervals.length <= 500
0 <= intervals[i].start < intervals[i].end <= 1,000,000

 */