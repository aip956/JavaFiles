/* https://leetcode.com/problems/find-good-days-to-rob-the-bank/
 * Find minima; create two arrays where
 * 1. Before: each element is less than previous, add 1 so cummulative num of descending
 * 2. After: each element is ascending; add 1 so cummulative num of ascending
 * 3. Result is where index of before and after are >= than time
 */



import java.util.*;
public class bestDayRobBank {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> output = new ArrayList<>();
        int[] numDaysBefore = new int[security.length];
        int[] numDaysAfter = new int[security.length];

        if (security.length < 1 + (2*time)) {
            return output;
        }
        // have to consider time is large

        // iterate left to right for numDaysBefore
        for (int i = 1; i < security.length; i++) {
            if (security[i] <= security[i-1]) {
                numDaysBefore[i] = 1 + numDaysBefore[i-1];
            }
            System.out.println("i: " + i);
            System.out.println("numDaysBefore[i]: " + numDaysBefore[i]);
            // System.out.println("numDaysBefore[i-1]: " + numDaysBefore[i-1]);
        }
        // iterate left to right for numDaysAfter
        for (int i = security.length - 2; i >= 0; i--) {
            if (security[i] <= security[i+1]) {
                numDaysAfter[i] = 1 + numDaysAfter[i+1];
            }
            System.out.println("i: " + i);
            System.out.println("numDaysAFter[i]: " + numDaysAfter[i]);

        }
        
        // iterate over time windows; where the before and after are >= time
        for (int i = time; i < security.length - time; i++) {
            // System.out.println("36: " + i);
            System.out.println("time: " + time);
            System.out.println("numDaysBefore[i]: " + numDaysBefore[i]);
            System.out.println("numDaysAfter[i]: " + numDaysAfter[i]);
            if (numDaysBefore[i] >= time && numDaysAfter[i] >= time) {
                output.add(i);
            }
        }
        return output;
    }



    public static void main(String[] args) {
        int[] security1 = {5,3,3,3,5,6,2};
        int time1 = 2;
        System.out.println("Output1: " + goodDaysToRobBank(security1, time1));
    }


}
