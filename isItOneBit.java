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
/*
 * We have two special characters. The first character can be represented by one
 * bit 0. The second character can be represented by two bits (10 or 11).
 * Now given a string represented by several bits. Return whether the last
 * character must be a one-bit character or not. The given string will always
 * end with a zero.
 * 
 * Example 00:
 * Input:
 * bits = [1, 0, 0]
 * Output: True
 ** Explanation:**
 * The only way to decode it is two-bit character and one-bit character. So the
 * last character is one-bit character.
 * 
 * Example 01:
 * Input:
 * bits = [1, 1, 1, 0]
 * Output: False
 ** Explanation:**
 * The only way to decode it is two-bit character and two-bit character. So the
 * last character is NOT one-bit character.
 * Note:
 * 
 * 1 <= len(bits) <= 1000.
 * bits[i] is always 0 or 1.
 */

/*
 * [1,1,0,1,0]
 * element type: 0, 1
 * number of elements:
 * last element is 1; part of two bit
 * last element i 0:
 * 2nd to last ele:
 * length of the array is even: could be 2x2 bits or 4x1, but if any 1s, need to
 * be part of 2 bit
 * if i sum the array, vs. the length, array length even: sum has to be even
 * array length even:
 * if sum of arr is odd: false
 * if summ of arr is even: true
 * array length is odd:
 * if sum of arr is odd: true
 * X if summ of arr is even: false
 * 
 * from left, el = 1, then el[]+1 makes the 2-bit
 * boolean: 2bit?
 * for length of array,
 * if array[i] == 1,
 * 
 */