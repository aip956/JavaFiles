import java.util.*;
class validPali2 {
    public static boolean isPalindrome(String s) {
        // create a string sb with only letters and nums
        // two pointers, l and r
        // while l<r
        // char at sb[r] must != sb[l] return false
        StringBuilder sb = new StringBuilder();
        // convert s to lower case
        s = s.toLowerCase();
        System.out.println("11s: " + s);
        // create sb = s with just letters and nums
        for (char letter : s.toCharArray()) {
            if (Character.isLetterOrDigit(letter)) {
                sb.append(letter);
            }
            System.out.println("15sb: " + sb);
        }
        // iterate from both ends
        int right = sb.length() - 1;
        int left = 0;
        while(left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                System.out.println(sb.charAt(left));
                System.out.println(sb.charAt(right));
                return false;
            }
            left++;
            right--;
        }
    return true;
    }

    public static void main(String[] args) {
        String input1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input1));
    }
}