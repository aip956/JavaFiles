import java.util.*;
class validPali2 {
    public boolean isPalindrome(String s) {
        // create a string sb with only letters and nums
        // two pointers, l and r
        // while l<r
        // char at sb[r] must != sb[l] return false
        StringBuilder sb = new StringBuilder();
        // convert s to lower case
        s.toLowerCase();
        // create sb = s with just letters and nums
        for (char letter : s.toCharArray()) {
            if (Character.isLetterOrDigit(letter)) {
                sb.append(letter);
            }
            System.out.println("15sb: " + sb);
        }
        // iterate from both ends
        int right = sb.length();
        int left = 0;
        while(left < right) {
            
        }
      
        
    return true;
    }

    public static void main(String[] args) {
        input1 = "A man, a plan, a canal: Panama";
        print(isPalindrome(input1));
    }
}