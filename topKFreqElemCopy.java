import java.util.*;

public class topKFreqElemCopy {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("9freqM: " + freqMap);

        // Add to priority queue
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        );
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Extract elements from minHeap
        int[] result = new int[k];
        int index = 0;
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().getKey();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] output = topKFrequent(nums, k);

        for (int i = 0; i < k; i++) {
            System.out.print(output[i]);
            if (i < k-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

/* https://leetcode.com/problems/top-k-frequent-elements/description/
 * make freq map of elem
 * create List<Map.Entry<Int, Int> of the freq map
 * Add to a priority queue to order
 * 
 */