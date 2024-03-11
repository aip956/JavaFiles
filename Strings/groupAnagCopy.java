import java.util.*;

public class groupAnagCopy {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            // create new string; don't use toString()
            String sortedWord = new String(wordArr);
            System.out.println("11sorted: " + sortedWord);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
            System.out.println("15: Map" + map);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Output1: " + groupAnagrams(strs1));
        String[] strs2 = {""};
        System.out.println("Output2: " + groupAnagrams(strs2));
        String[] strs3 = {"a"};
        System.out.println("Output3: " + groupAnagrams(strs3));

    }
}

/* return list of strings
key will be sorted word, vals will be list: ate: eat, ate, tea
Take in string: convert to char array, sort it, stringify
if the sorted word is not in map, add it
add the word (original) to the sorted word's list
*/