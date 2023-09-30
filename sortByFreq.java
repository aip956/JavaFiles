import java.util.*;
public class sortByFreq {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
            System.out.println("7freqMap: " + freqMap);
        }
        Collections.sort(freqMap);
        System.out.println("10freqMap: " + freqMap);

        return s;
    }


    public static void main(String[] args) {
        String s1 = "tree";
        System.out.println("Output1: " + frequencySort(s1));
    }
    
}
