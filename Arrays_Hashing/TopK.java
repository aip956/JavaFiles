import java.util.*;

class TopK {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
        (a, b) -> a.getValue() - b.getValue()
        );

        // add to heap
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll(); // remove entry of lowest freq
            }
        }
        // Extract elements from heap
        int[] result = new int[k];
        int index = 0;
        while(!pq.isEmpty()) {
            result[index++] = pq.poll().getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] output = topKFrequent(nums, k);
        System.out.println(Arrays.toString(output));
    }
}

/*
Freq map of each element of array
PQueue to store the elements in order of freq
If the size of PQ > k, remove the least frequent element
Add remaining elements to the result array
return result array

 * Given an integer array nums and an integer k, 
 * return the k most frequent elements. 
 * You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]

 */