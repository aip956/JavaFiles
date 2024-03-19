class validPalin {
    public boolean isPalindrome(String s) {
        char[] s_arr = s.toCharArray();
        s_arr = s_arr.downcase();
        for (int i = 0; i < s_arr.length; i++ )  {
            if (Character.toLowerCase(s_arr[i]) >= 'a' && Character.toLowerCase(s_arr[i]) <= 'z') {
                
            }
            for (int j = s_arr.length-1; j >= 0; j--) {

            }
        }
    }


    public static void main(String[] args) {

    }
}

/*
https://leetcode.com/problems/valid-palindrome/description/

start at both ends; each element must equal each other after downcase and 
if alphanumeric

 * A phrase is a palindrome if, after converting all uppercase letters 
 * into lowercase letters and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. Alphanumeric characters 
 * include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */