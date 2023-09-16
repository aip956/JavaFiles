// https://leetcode.com/problems/reverse-bits/
// n2 is not correct in vscode, but works in leetcode

public class reverseBits {
    public int reverseBits(int n) {
        // long unsignedN = Integer.toUnsignedLong(n);
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= (n & 1);
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        long n1 = 0b00000010100101000001111010011100L;
        int n2 = 0b11111111111111111111111111111101;
        reverseBits solution = new reverseBits();
        // System.out.println("N1: " + solution.reverseBits((int)n1)); 
        System.out.println("N2: " + solution.reverseBits((int)n2));
    }
}
