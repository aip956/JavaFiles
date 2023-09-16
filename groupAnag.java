// https://leetcode.com/problems/group-anagrams/submissions/
// use hash to group
// O(mn) m input strings; n length of string
// create array for each word; 26 x 0 to count each letter

import java.util.*;

public class groupAnag {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        // String[] strs = {"eat","tea","tan","ate","nat","bat"};
        // String[] strs = {""};
        String[] strs = {"a"};
        System.out.println(groupAnagrams(strs));
    }
}
