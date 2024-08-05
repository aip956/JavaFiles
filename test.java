import java.util.*;

public class test {
    public static int[] topKFrequent(int[] nums, int k) {
        // create a hashmap to store the frequency of each number
        // create a priority queue to store the numbers in order of frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);  
            System.out.println("10freqMap: " + freqMap);      
        }
        System.out.println("freqMap: " + freqMap);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : freqMap.keySet()) {
            if (pq.size() < k)
                pq.offer(num);   
        }
        
        System.out.println("pq: " + pq);
        int[] result = new int[k];
        int index = 0;
        while (!pq.isEmpty()) {
            result[index++] = pq.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;
        System.out.println("Output1: " + topKFrequent(nums1, k1));
    }
}