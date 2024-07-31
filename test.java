import java.util.*;

public class test {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // for each word, 
        // sort it
        // if sorted word is not in map, put it
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String sortedWord = new String(wordArr);
            if (!map.containsKey (sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
                System.out.println("15map: " + map);
            }
        // Add word to the sortedWords's list
        map.get(sortedWord).add(word);
        System.out.println("20map: " + map);
        }
        // return the values of the map without key
        return new ArrayList<>(map.values()); 
    }




    public static void main(String[] args) {
        String[] str1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Output1: " + groupAnagrams(str1));
        String[] str2 = {""};
        System.out.println("Output2: " + groupAnagrams(str2));
    }
}