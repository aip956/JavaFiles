

class repeatedString {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    // Write your code here
        long freq = 0;
        String repeated = String.repeat(n);
        for (int i = 0; i <= n; i++ ) {
            if (repeated.charAt(i) == 'a') {
                freq ++;
                System.out.println("i: " + i);
                System.out.println("freq: " + freq);
            }
        }
        return freq;

    }

    public static void main(String[] args) {
        String s = "abcac";
        long n = 10;
        System.out.println(repeatedString(s, n));
    }

}