import java.util.*;

public class isItOneBit {
    public static boolean isOneBitCharacter(int[] bits) {
        // [1,1,0,0,0] ; length =5
        System.out.println("5: " + bits[2]);
        int i = 0;
        boolean isOne = true;
        while (i < bits.length) {
          if (bits[i] == 1) {
            i += 2;
            isOne = false;
          } else {
            i++;
            isOne = true;
          }
        }
        return isOne;
      }
    
      public static void main(String[] args) {
        // System.out.println("21Hello world!");
        int[] bits = { 1, 0, 0 };
        int[] bits2 = { 1, 1, 1, 0 };
        int[] bits3 = { 1, 0, 1, 1, 0 };
        System.out.println("Is it a 1-bit: " + isOneBitCharacter(bits));
        System.out.println("Is it a 1-bit: " + isOneBitCharacter(bits2));
        System.out.println("Is it a 1-bit: " + isOneBitCharacter(bits3));

      }



}
