// https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class topKFreqElem {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        // add to Hash the number, freq
        for (int number : nums) {
            freqMap.put(number, freqMap.getOrDefault(number, 0) + 1);
            System.out.println("freqMap: " + freqMap);
        }
        // create a pq prioritizing the value/freq of freqMap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(freqMap::get));

        for (int num : freqMap.keySet()) {
            pq.offer(num); // add the num to the pq
            System.out.println("PQ: " + pq);
            if (pq.size() > k) {
                pq.poll(); // remove least freq elements if q size > k
            }
        }

        int[] result = new int[k]; // size limited to k
        int index = 0;
        while (!pq.isEmpty()) {
            System.out.println("index: " + index);
            result[index++] = pq.poll();
            System.out.println("result: " + Arrays.toString(result));
        }
        return result;
    }




    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2; 
        // int[] nums2 = {1};
        // int k2 = 1;
        System.out.println("Output: " + Arrays.toString((topKFrequent(nums, k))));
    }
}
