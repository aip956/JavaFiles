// https://leetcode.com/problems/add-to-array-form-of-integer/submissions/

import java.util.ArrayList;
import java.util.List;

public class addArrayToNum {
    
    // public static List<Integer> addToArrayForm(int[] num, int k) {
    //     // convert num to a number; mult each num by 10 and add
    //     // add k
    //     // convert back to array    
    //     long number = 0;
    //     for (int el : num) {
    //         number = (number * 10) + el;
    //         // System.out.println("number: " + number);
    //     }
    //     long sum = number + k; 
    //     System.out.println("16number: " + number);
    //     System.out.println("16sum: " + sum);
        
    //     // Convert to array list
    //     List<Integer> list = new ArrayList<>();
    //     while (sum > 0) {
    //         int elem = (int)(sum % 10);
    //         list.add(0, elem);
    //         System.out.println("elem: " + elem);
    //         sum /= 10;
    //         System.out.println("sum: " + sum);
    //     }
        
    //     // print the list
    //     for (int each : list) {
    //         System.out.print(each + " ");
    //     }
    //     return list;
    // }

    /* this passes;
    To solve this problem, you need to handle the addition 
    of the array num with the integer k while accounting for
    possible carryovers. 
    We start by initializing an empty ArrayList to store the result.

We maintain two pointers, one pointing to the last digit of the num array 
(initialized as i = num.length - 1) and another variable carry (initialized as 0). 
The carry variable will store the carryover value from the previous addition.

We enter a while loop that continues as long as there are more digits in the 
num array or there's a carryover (i >= 0 || carry > 0). Within the loop:

a. We calculate the current digit by adding the last digit of num (if available) with the k value and the previous carry value. If there's no digit in num, we just add the k value and the carry. The result is stored in temp.
b. We calculate the carry for the next iteration by dividing temp by 10 (using integer division).
c. We calculate the current digit for the result array by taking the remainder of temp when divided by 10.
d. We add the current digit to the front of the result list (since we're processing the digits in reverse order).
e. If there are more digits in the num array, we decrement the pointer i to move to the next digit.
f. If there are no more digits in num, we continue processing with the carry value.
After the loop, if there's still a carry value, we add it as the first element of the result (if it's not zero).
Finally, we return the result list, which now contains the array form of the sum.
This code processes the input num and k from right to left, considering carryovers at each step, and builds the resulting list in the correct order.



    */
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        int i = num.length - 1;
        
        while (i >= 0 || k > 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num[i];
                i--;
            }
            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }
            
            result.add(0, sum % 10);
            carry = sum / 10;
        }
        
        return result;
    }


    public static void main(String[] args) {
        // int[] A = {1,2,0,0};
        // int K = 34;
        // int[] A = {2,1,5};
        // int K = 806;
        int[] A = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int K = 516;
        // int[] A = {9,9,9,9,9,9,9,9,9,9};
        // int K = 1;
        System.out.println("Output: " + addToArrayForm(A, K));
        // System.out.println("Output: " + convertToNum(A));
    }
}
