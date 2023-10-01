/* Write a function my_union that takes two strings and returns, without doubles, 
 * the characters that appear in either one of the strings.
 * Input: "zpadinton" && "paqefwtdjetyiytjneytjoeyjnejeyj"
 * Output:
 * Return Value: "zpadintoqefwjy"
 * 
 * Iterate over first string, check if char is in the DS. 
 * If not, add to it.
 * Same with second string
 * Convert output to string and return
 * DS needs to maintain insertion order and be searchable 
 */


import java.util.*;
public class unionStrings {
    public static String my_union(String str1, String str2) {
        ArrayList<Character> uniqueChars = new ArrayList<>();
        for (char letter : str1.toCharArray()) {
            if (!uniqueChars.contains(letter)) {
                uniqueChars.add(letter);
            }
        }
        for (char letter : str2.toCharArray()) {
            if (!uniqueChars.contains(letter)) {
                uniqueChars.add(letter);
            }
        }
        // System.out.println("24uniqueChars AL: " + uniqueChars);
        StringBuilder uniqueSB = new StringBuilder();
        for (char letter : uniqueChars) {
            uniqueSB.append(letter);
        }
        // System.out.println("34uniqueSB2str: " + uniqueSB.toString());
        return uniqueSB.toString();
    }
    

    public static void main(String[] args) {
        String input1a = "zpadinton";
        String input1b = "paqefwtdjetyiytjneytjoeyjnejeyj";
        // my_union(input1a, input1b);
        String expected1 = "zpadintoqefwjy";
        boolean compare1 = expected1.equals(my_union(input1a, input1b));
        System.out.println(compare1);

        String input2a = "ddf6vewg64f";
        String input2b = "gtwthgdwthdwfteewhrtag6h4ffdhsd";
        String expected2 = "df6vewg4thras";
        boolean compare2 = expected2.equals(my_union(input2a, input2b));
        System.out.println(compare2);

        String input3a = "rien";
        String input3b = "cette phrase ne cache rien";
        String expected3 = "rienct phas";
        boolean compare3 = expected3.equals(my_union(input3a, input3b));
        System.out.println(compare3);
    }
}
