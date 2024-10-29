// https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
/*
 * Create a hashmap to store the frequency of each number
 * Create a priority queue to store the numbers in order of frequency
 * For each number in the input array, add to the hashmap
 * For each number in the hashmap, add to the priority queue
 * If the size of the priority queue is greater than k, remove the least frequent element
 * Add the remaining elements to the result array
 * Return the result array
 */

public class topKFreqElem {
    public static int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> freqMap = new HashMap<>();
       for (int num : nums) {
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
       }
       System.out.println("FreqMap: " + freqMap);

       // add to pq and sort ascending
       PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
        (a, b) -> a.getValue() - b.getValue()
       );

       // add to heap and maintain only k vals
       for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll(); // remove entry with the lower freq
            }
       }

       // Extract elements from heap
       int[] result = new int[k];
       int index = 0;
       while (!pq.isEmpty()) {
        result[index++] = pq.poll().getKey();
       }

       return result;





        // HashMap<Integer, Integer> freqMap = new HashMap<>();
        // // add to Hash the number, freq
        // for (int number : nums) {
        //     freqMap.put(number, freqMap.getOrDefault(number, 0) + 1);
        //     System.out.println("freqMap: " + freqMap);
        // }
        // // create a pq prioritizing the value/freq of freqMap
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(freqMap::get));

        // for (int num : freqMap.keySet()) {
        //     pq.offer(num); // add the num to the pq
        //     System.out.println("PQ: " + pq);
        //     if (pq.size() > k) {
        //         pq.poll(); // remove least freq elements if q size > k
        //     }
        // }

        // int[] result = new int[k]; // size limited to k
        // int index = 0;
        // while (!pq.isEmpty()) {
        //     System.out.println("index: " + index);
        //     result[index++] = pq.poll();
        //     System.out.println("result: " + Arrays.toString(result));
        // }
        // return result;
    }




    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2; 
        // int[] nums2 = {1};
        // int k2 = 1;
        System.out.println("Output: " + Arrays.toString((topKFrequent(nums, k))));
    }
}

/*
https://leetcode.com/problems/top-k-frequent-elements/description/
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 */