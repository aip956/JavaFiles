package Bits;
// https://leetcode.com/problems/number-of-1-bits/description/

public class numbBits {
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1; // right shift n by one
        }
        return count;
    }

    public static void main(String[] arg) {
        int n1 = 0b00000000000000000000000000001011;
        int n2 = 0b00000000000000000000000010000000;
        int n3 = 0b11111111111111111111111111111101;
        System.out.println("N1: " + hammingWeight(n1)); // 3
        System.out.println("N2: " + hammingWeight(n2)); // 1
        System.out.println("N3: " + hammingWeight(n3)); // 31
    }
}
