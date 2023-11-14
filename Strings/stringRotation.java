// https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1
import java.util.*;

public class stringRotation {
        public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        // if lengths not equal, return false
        // concat s1+s1
        // does it contain s2?
        if (s1.length() != s2.length()) {
            return false;
        }
        String tempS1 = s1+s1;
        System.out.println("10tempS1: " + tempS1);
        return tempS1.contains(s2);
    }

    public static void main(String[] args) {
        // String s1 = "geeksforgeeks";
        // String s2 = "forgeeksgeeks";
        String s1 = "mightandmagic";
        String s2 = "andmagicmigth";
        System.out.println("Output1: " +areRotations(s1,s2));
    }
}
