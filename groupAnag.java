// https://leetcode.com/problems/group-anagrams/submissions/
// use hash to group
// O(mn) m input strings; n length of string
// create array for each word; 26 x 0 to count each letter
/*
 * crate Map <String, List<String>>
 * for each word in strs
 * convert to charArray
 * Sort the charArray word
 * Convert back to string
 * If Map does not containsKey sortedWord, put (sortedWord, new ArrayList<>()) (sorted word and empty array list)
 * Add the sorted word
 * return a new array list of the map values 
 */

import java.util.*;

public class groupAnag {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // word in the strs array, sorted word
        // create charArray for each word => sorted word
        // if sorted word is in the wordMap, add based on sorted version

        Map<String, List<String>> strMap = new HashMap<>();
        for (String word : strs) {
            char[]charArrWord = word.toCharArray();
            Arrays.sort(charArrWord);
            String sortedWord = new String(charArrWord);
            if (!strMap.containsKey(sortedWord)) {
                strMap.put(sortedWord, new ArrayList<>());
            }
            strMap.get(sortedWord).add(word);
        }
        return new ArrayList<>(strMap.values());
        // Map<String, List<String>> strsMap = new HashMap<>();
        // for (String word : strs) {
        //     char[] wordCharArray = word.toCharArray();
        //     // System.out.println("40wordCharArray: " + wordCharArray);
        //     Arrays.sort(wordCharArray);
        //     // String sortedWord = wordCharArray.toString();
        //     String sortedWord = new String(wordCharArray);
        //     System.out.println("42sortedWord: " + sortedWord);
        //     if (!strsMap.containsKey(sortedWord)) {
        //         strsMap.put(sortedWord, new ArrayList<>());
        //         System.out.println("45strsMap: " + strsMap);

        //     }
        //     strsMap.get(sortedWord).add(word);
        //     System.out.println("49strsMap: " + strsMap);
        // }
        // return new ArrayList<>(strsMap.values());

    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        // String[] strs = {""};
        // String[] strs = {"a"};
        System.out.println(groupAnagrams(strs));
    }
}

/*
 // public static List<List<String>> groupAnagrams(String[] strs) {
    //     Map<String, List<String>> map = new HashMap<>();

    //     for (String word : strs) {
    //         // make a char[] from the word
    //         char[] chars = word.toCharArray();
    //         // sort letters in the word
    //         Arrays.sort(chars);
    //         // make a string from the chars[]; bat => abt
    //         String sortedWord = new String(chars);

    //         // if the map does not contain the sorted word, add it and empty ArrayList
    //         if (!map.containsKey(sortedWord)) {
    //             map.put(sortedWord, new ArrayList<>());
    //             System.out.println("23map: " + map);
    //         }
    //         // add the word based on it's sorted version
    //         map.get(sortedWord).add(word);
    //         System.out.println("27map: " + map);
    //     }
    //     return new ArrayList<>(map.values());
    // }
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.


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