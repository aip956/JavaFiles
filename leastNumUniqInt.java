import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.*;

public class leastNumUniqInt {
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        // Remove the greatest frequency numbers
        // create freqMap Hash / 
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("freqMap: " + freqMap);  

        // store in a priorityQ(ascending order)
        // PriorityQueue<Map.Entry<Integer, Integer>> PQMap = new PriorityQueue<>((a, b) -> a.getValue().compareTo(b.getValue())); 
        // minHeap.addAll(frequencyMap.entrySet());

        // PriorityQueue<Map.Entry<Integer, Integer>> PQMap = new PriorityQueue<>((a, b) -> a.getValue().compareTo(b.getValue())); 
        // PQMap.addAll(freqMap.entrySet());
        // System.out.println("PQMap: " + PQMap); 
        
        // sort the frequencies
        List<Integer> sortedFreq = new ArrayList<>(freqMap.values());
        Collections.sort(sortedFreq);
        System.out.println("sortedFreq: " + sortedFreq); 

        // remove the k entries (of lowest frequency)
       // Map.Entry<Integer, Integer> entry = minHeap.poll();
        // remaining map has highest frequencies; return siz

        // 1,1,2,3
        int uniqNums = sortedFreq.size();

        for (int num : sortedFreq) {
            if (k >= num) {
                k -= num;
                uniqNums--;
                System.out.println("k: " + k + " , uniqNums: " + uniqNums);
            }
        }
        // System.out.println("entry: " + entry + " , PQMap: " + PQMap);
        System.out.println("uniqNums: " + uniqNums);
        
        return uniqNums;
    }



    public static void main(String[] args) {
        int[] arr1 = {5, 5, 4};
        int k1 = 1;
        int output1 = findLeastNumOfUniqueInts(arr1, k1);
        System.out.println("Output1: " + output1); // Output: 
        int[] arr2 = {4, 3, 1, 1, 3, 3, 2};
        int k2 = 3;
        int output2 = findLeastNumOfUniqueInts(arr2, k2);
        System.out.println("Output2: " + output2); // Output: 
    }
}

/*
 * 1481. Least Number of Unique Integers after K Removals
Medium
1.4K
138
Companies
Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.

Example 1:
Input: arr = [5,5,4], k = 1
Output: 1
Explanation: Remove the single 4, only 5 is left.
Example 2:
Input: arr = [4,3,1,1,3,3,2], k = 3
Output: 2
Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
 

Constraints:

1 <= arr.length <= 10^5
1 <= arr[i] <= 10^9
0 <= k <= arr.length
 * 
 * import java.util.*;

public class LeastUniqueIntegers {
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue().compareTo(b.getValue()));
        minHeap.addAll(frequencyMap.entrySet());
        
        while (k > 0) {
            Map.Entry<Integer, Integer> entry = minHeap.poll();
            if (entry.getValue() > 1) {
                minHeap.add(Map.entry(entry.getKey(), entry.getValue() - 1));
            }
            k--;
        }
        
        return minHeap.size();
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 5, 4};
        int k1 = 1;
        System.out.println("Least number of unique integers: " + findLeastNumOfUniqueInts(arr1, k1)); // Output: 1
        
        int[] arr2 = {4, 3, 1, 1, 3, 3, 2};
        int k2 = 3;
        System.out.println("Least number of unique integers: " + findLeastNumOfUniqueInts(arr2, k2)); // Output: 2
    }
}


 */