// https://docs.google.com/document/d/1z0cH49vGZVqZ2AZOSgIZizMOZt9OmekYcHVshleolPo/edit



import java.util.*;

public class sortByFreq {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
            System.out.println("7freqMap: " + freqMap);
        }
        // Convert HashMap entries to a list
        List<Map.Entry<Character, Integer>> charList = new ArrayList<>(freqMap.entrySet());

        // Sort the list by vals / freqs in descending
        charList.sort((a, b) -> b.getValue() - a.getValue());

        // Stringbuilder to build the output
        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charList) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                output.append(character);
            }
        }
        return output.toString();
    }


    public static void main(String[] args) {
        String s1 = "tree";
        System.out.println("Output1: " + frequencySort(s1));
    }
    
}
