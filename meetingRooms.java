import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// sort based on start; O(nlogn)
// iterate through O(n)
// determine if 2nd start time is < 1st end time => return false
// if 2nd start >= 1st end time

public class meetingRooms {
    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }    
    public static boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        int[][] intArray = new int[intervals.size()][2];
        for (int i = 0; i < 2; i++) {
            Interval interval = intervals.get(i);
            intArray[i][0] = interval.start;
            intArray[i][1] = interval.end;
        }
        Arrays.sort(intArray, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i][0] < intArray[i-1][1]) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] arg) {
        List<Interval> intervals1 = Arrays.asList(new Interval(0, 30), new Interval(5, 10), new Interval(15, 20));
        System.out.println("Example 1: " + canAttendMeetings(intervals1)); // Output: false

        List<Interval> intervals2 = Arrays.asList(new Interval(5, 8), new Interval(9, 15));
        System.out.println("Example 2: " + canAttendMeetings(intervals2)); // Output: true
    }
        // Now you can pass intervals and intervals2 to your helper function.
        // For example:
        // someFunction(intervals);
        // someFunction(intervals2);
}




