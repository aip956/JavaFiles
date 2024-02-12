public class longestPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // iterate through the strings length - 1
        // for each char in string, if in all elements, add char to string
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) { // iterate in a word
            char currLetter = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) { // iterate through the array words
                // if i is >= word or not= letter, stop and return
                if (i >= strs[j].length() || strs[j].charAt(i) != currLetter){
                    return output.toString();
                }
            }
            output.append(currLetter);
        }
        return output.toString();
        
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        System.out.println("Output1: " + longestCommonPrefix(strs1)); // "fl"
        System.out.println("Output2: " + longestCommonPrefix(strs2)); // ""
    }
}
