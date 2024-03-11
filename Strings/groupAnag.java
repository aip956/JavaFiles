import java.util.*;

public class groupAnag {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Initialize Map
        HashMap<String,List<String>> map = new HashMap<>();
        for (String word : strs) {
            // Convert word to char array to sort it, then to string
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String sortedWord = wordArr.toString();

            // Group Anagrams in Map; sorted word is key
            // If map does not contain the sorted word as key, creates a new empty list
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            // Add the word to the sortedWord's list
            map.get(sortedWord).add(word);

        }
        // return the values of the map without key
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
/*

For each word,
change word to charArray, sort the word, stringify the word
it will be the key and will have a corresponding list

if the map does not contain the word, put it: word, new ArrayList
get the sortedWord, add word
return arrayList's values

 * https://leetcode.com/problems/group-anagrams/description/
 * Given an array of strings strs, group the anagrams together. 
 * You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters 
of a different word or phrase, typically using all the original 
letters exactly once.

 

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

 */