import java.util.*;

public class endcodeDecStr {
    
public static String encode(List<String> strs) {
        // write your code here
        // append stringLength+#+string
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        // write your code here
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;
            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("lint");
        input.add("code");
        input.add("love");
        input.add("you");

        // Encode the list of strings to a single string
        String encodedString = encode(input);
        System.out.println("Encoded String: " + encodedString);

        // Decode the string back to a list of strings
        List<String> decodedList = decode(encodedString);
        System.out.println("Decoded List: " + decodedList);
    }

}
