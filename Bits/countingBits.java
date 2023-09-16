package Bits;
import java.util.*;

public class countingBits {

    public static int[] countBits(int n) {
        int res[] = new int [n + 1];
        for (int i = 1; i <= n; i++) {
            res[i] = 1 + res[i & (i - 1)];
        }
        return res;
    }


    public static void main (String[] args) {
        int n1 = 2;
        int n2 = 5;
        int[] result1 = countBits(n1);
        int[] result2 = countBits(n2);

        // convert array result to string
        System.out.println("N1: " + Arrays.toString(result1));
        System.out.println("N2: " + Arrays.toString(result2));

    }
}
