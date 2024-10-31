/*
 * Design an algorithm to encode a list of strings
 *  to a string. The encoded string is then sent over
 *  the network and is decoded back to the original 
 * list of strings.

Please implement encode and decode
 */
import java.util.*;
 public class EncodeDecode {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public static String encode(List<String> strs) {
        // write your code here
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
        List<String> decodedStrings = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // Find position of delimiter '#'
            int delimiterIndex = str.indexOf('#', i);
            System.out.println("delimiterIndex: " + delimiterIndex);
            // Extract the length of the string
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            System.out.println("length: " + length);
            // Move i to the start of the string
            i = delimiterIndex + 1;
            System.out.println("i: " + i);
            // Extract the string of the specified length and add it to the list
            decodedStrings.add(str.substring(i, i + length));
            System.out.println("DecodedString: " + decodedStrings);
            // Move i past the curent string
            i += length;
            System.out.println("i: " + i);
        }
        return decodedStrings;
    }


    public static void main(String[] args) {
        List<String> input1 = Arrays.asList("neet", "code", "love", "you");
        String encoded1 = encode(input1);
        System.out.println("Encoded: " + encoded1);
        System.out.println("Decoded: " + decode(encoded1));
    }
}