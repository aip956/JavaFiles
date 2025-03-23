import java.util.*;

class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<Integer, Integer> res = new List<>();


        return res;
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(merge(intervals1));
        System.out.println();
    }
}


/*
sort by first element: arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]))
create new List res

[[1,3],[2,6],[8,10],[15,18]]  => [[1,3],[2,6],[8,10],[15,18]]  
Add the first interval to result; res.add(new int[]{arr[0][0],arr[0][1]})
res: [1,3]
Merge an overlap; use greater end time
res: [1,3] , [2, 6] = [1, 6]
go to next interval; is interval start < prev interval end
no: next interval


 * Merge Overlapping Intervals
Problem Statement:
 You are given a list of intervals where each interval is represented as [start, end]. Your task is to merge all overlapping intervals and return a new list of non-overlapping intervals.
Requirements:
The intervals should be sorted in ascending order based on their start times before processing.


The algorithm should run in O(n log n) time complexity due to sorting.


Example Cases:

Input: [[1,3],[2,6],[8,10],[15,18]]  
Output: [[1,6],[8,10],[15,18]]  
Explanation: The intervals [1,3] and [2,6] overlap, so they are merged into [1,6].

Input: [[1,4],[4,5]]  
Output: [[1,5]]

 */