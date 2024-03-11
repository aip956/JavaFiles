import java.util.*;

public static class groupAnagCopy {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String sortedWord = wordArr.toString();
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Output1: " + groupAnagrams(strs1));

    }
}

/* return list of strings
key will be sorted word, vals will be list: ate: eat, ate, tea
Take in string: convert to char array, sort it, stringify
if the sorted word is not in map, add it
add the word (original) to the sorted word's list
*/