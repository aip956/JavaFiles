import java.util.*;

// Definition of Interval:
class Interval {
     public int start, end;
     public Interval(int start, int end) {
         this.start = start;
         this.end = end;
     }
 }


 class meetingRooms2 {
    public static int minMeetingRooms(List<Interval> intervals) {
        // error checking
        if (intervals == null || intervals.size() == 0) return 0;
        // sort by start time
        intervals.sort(Comparator.comparingInt(a -> a.start));
        
        // create heap structure
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // iterate through intervals; if curr meeting starts after or when earliest meeting ends,
        // remove the ending meeting; free up room
        for (Interval meeting : intervals) {
            // remove room
            if (!minHeap.isEmpty() && minHeap.peek() <= meeting.start) {
                minHeap.poll();
            }
            // Add curr meeting end time to heap
            minHeap.add(meeting.end);
        }
        return minHeap.size();
    }

    public static void main(String[] args) {
        List<Interval> intervals1 = Arrays.asList(
            new Interval(0,30),
            new Interval(5,10), // intervals.get(1).start, .end
            new Interval(15,20)
        );
        System.out.println("Min rooms: " + minMeetingRooms(intervals1));

    }
}


/*
 * Meeting Rooms II
 * When is the earliest a meeting ends
 * Use minHeap
 * 
 * 
 * 
 * 
 * 
 * Sort the intervals
 * Create start and end arrays
 * Compare start vs. end; if start < end, increment rooms
 * result and count vars
 * s and e pointers
 * while s < len(intervals)
 * if start[s] < end[e]
 *  s += 1
 *  count += 1
 * else:
 *  e += 1
 *  count -= 1
 * result = Max(res, count)
 * return result
Given an array of meeting time interval objects 
consisting of start and end times [[start_1,end_1],
[start_2,end_2],...] (start_i < end_i), find the 
minimum number of days required to schedule all 
meetings without any conflicts.

Example 1:
Input: intervals = [(0,40),(5,10),(15,20)]
Output: 2
Explanation:
day1: (0,40)
day2: (5,10),(15,20)

Example 2:
Input: intervals = [(4,9)]
Output: 1
Note:

(0,8),(8,10) is not considered a conflict at 8
Constraints:

0 <= intervals.length <= 500
0 <= intervals[i].start < intervals[i].end <= 1,000,000

 */