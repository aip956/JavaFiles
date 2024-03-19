class validPalin {
    public static boolean isPalindrome(String s) {
        // convert to lower case
        s = s.toLowerCase();
        // build a string with solely char or dig
        StringBuilder sb = new StringBuilder();
        for (char elem : s.toCharArray()) {
            if (Character.isLetterOrDigit(elem)) {
                sb.append(elem);
            }
        }
        String alNumString = sb.toString();


        int r = alNumString.length() - 1;
        int l = 0;
        while (r > l) {
            if (alNumString.charAt(l) != alNumString.charAt(r)) {
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Output1: " + isPalindrome(s1));
        String s2 = "race a car";
        System.out.println("Output2: " + isPalindrome(s2));
        String s3 = " ";
        System.out.println("Output3: " + isPalindrome(s3));
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