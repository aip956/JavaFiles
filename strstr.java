public class strstr {
    public static int findStrstr(String s, String x) {
        // Geeksforgeeks; fr
        // mississippi, 11; issi, 4
        int lenS = s.length();
        int lenX = x.length();
        x.toCharArray();
        s.toCharArray();
        int i;
   
        for (i = 0; i <= lenS - lenX; i++) {
            boolean found = true;
            for (int j = 0; j < lenX; j++) {
                if (s.charAt(i+j) != x.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
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


