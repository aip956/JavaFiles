public class longestPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // iterate through the strings length - 1
        // for each char in string, if in all elements, add char to string
        String output = new String("");
        for (int i = 0; i < strs.length(); i++) { // iterate through the array
            for (int j = 0; j < strs[0].length(); j++) { // iterate in a word
                char letter = strs[0][j]

            }
        }

        return output;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        System.out.println("Output1: " + longestCommonPrefix(strs1)); // "fl"
        System.out.println("Output2: " + longestCommonPrefix(strs2)); // ""
}
