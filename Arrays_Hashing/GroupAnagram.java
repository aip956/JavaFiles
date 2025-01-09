import java.util.*;
class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] word_char_arr = word.toCharArray();
            Arrays.sort(word_char_arr);
            String sorted_word = new String(word_char_arr);
            if (!map.containsKey(sorted_word)) {
                map.put(sorted_word, new ArrayList<>());
            }
            map.get(sorted_word).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}

// adding comment for testing 