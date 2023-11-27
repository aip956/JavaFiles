public class strstr {
    // public static int findStrstr(String s, String x) {
    //     // Geeksforgeeks; fr
    //     // mississippi, 11; issi, 4
    //     int lenS = s.length();
    //     int lenX = x.length();
    //     x.toCharArray();
    //     s.toCharArray();
    //     int i;
   
    //     //  mississippi, 11; issi, 4
    //     //  iterate 11 - 4 = 7
    //     // set boolean = true
    //     // iterate over lenght of substring
    //     // if string.charAt i+j != substr.charAt j, 
    //     // set to false, move to next string letter 
    //     // if they equal, keep iterating through lenX
    //     for (i = 0; i <= lenS - lenX; i++) {
    //         boolean found = true;
    //         for (int j = 0; j < lenX; j++) {
    //             if (s.charAt(i+j) != x.charAt(j)) {
    //                 found = false;
    //                 break;
    //             }
    //         }
    //         if (found) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }


    public static int findStrstr(String s, String x) {
   /*
   s = "mississippi", x = "ippi"
    * iterate over length of s - x
    length s, length x
    set boolean true
    iterate over length x
    for each letter in x, if != s, set boolean to false
    if makes through all x, return boolean = true and index
    https://replit.com/@aip956/Role455
    */
        Integer sLen = s.length();
        Integer xLen = x.length();
        s.toCharArray();
        x.toCharArray();

        for (int i = 0; i < sLen - xLen; i++) {
            boolean match = true;
            for (int j = 0; j < xLen; j++) {
                if (s.charAt(i+j) != x.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match == true) {
            return i;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        // s = GeeksForGeeks, x = Fr
        // String b = "geeksquiz";
        // String s = "GeeksForGeeks";
        // String x = "Fr";
        String s = "Mississippi";
        String x = "issip";
        Integer output = findStrstr(s, x);
        System.out.println("Output: " + output); // Output: 
    }
}


