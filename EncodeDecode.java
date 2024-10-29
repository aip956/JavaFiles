/*
 * Design an algorithm to encode a list of strings
 *  to a string. The encoded string is then sent over
 *  the network and is decoded back to the original 
 * list of strings.

Please implement encode and decode
 */

 public class EncodeDecode {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
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
    public List<String> decode(String str) {
        // write your code here
    }


    public static void main(String[] args) {
        
    }
}