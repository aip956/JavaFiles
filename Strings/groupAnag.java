import java.util.HashMap;
import java.util.List;

public class groupAnag {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (String word : strs) {
            chars[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String sortedWord = wordArr.toString();

        }
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Output1: " + groupAnagrams(strs1));

    }
}
/*
For each word,
change word to charArray
sort the word
stringify the word
if the map does not contain the word, put it: word, new ArrayList
get the sortedWord, add word
return arrayList
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