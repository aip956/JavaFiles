

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
        long s_in_n = n / s.length(); // number of strings in n
        long timesInString = 0;
        long remainder = n % s.length(); // remainder of s
        // count number of a's in s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') timesInString ++;
        }
        timesInString *= s_in_n;
        // count number of a's in remainder
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') timesInString ++;
        }
        return timesInString;
    }

    public static void main(String[] args) {
        String s = "abcac";
        long n = 10;
        System.out.println(repeatedString(s, n));
    }

}


/*
 * https://www.hackerrank.com/challenges/repeated-string/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * count a's in original string
 * count how many times s fits in n: times = n/s.length
 * count remainder of partial string: a's inRemainder = n % s.length
 * repeats = times + a's inRemainder
 * 
 */