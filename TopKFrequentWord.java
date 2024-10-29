 /*
         * Count frequency of each num
         * Organize by frequency
         * If words have same freq, order lexicographically
         * Extract k words
         */
import java.util.*;
public class TopKFrequentWord {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        // Create priority queue by freq, and lex
        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((a, b) -> {
            // Sort by freq
            if (!a.getValue().equals(b.getValue())) {
                return a.getValue() - b.getValue();
            }
            // Sort by lex
            return b.getKey().compareTo(a.getKey());
            }
        );
    
        // Add each entry from the freq map to the queue
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        // Extract elements from the queue
        List<String> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().getKey());
        }

        // Reverse the list
        Collections.reverse(result);
        return result;

    }


    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }
}