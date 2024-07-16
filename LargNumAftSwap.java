import java.util.*;

public class LargNumAftSwap {
    public int largestInteger(String num) {
        // Separate digits by parity
        ArrayList<Character> oddDigits = new ArrayList<>();
        ArrayList<Character> evenDigits = new ArrayList<>();

        for (char digit : num.toCharArray()) {
            if ((digit - '0') % 2 == 0) {
                evenDigits.add(digit);
            } else {
                oddDigits.add(digit);
            }
        }

        // Sort the digits in descending order
        Collections.sort(oddDigits, Collections.reverseOrder());
        Collections.sort(evenDigits, Collections.reverseOrder());

        // Initialize the result
        StringBuilder result = new StringBuilder();

        // Pointers for odd and even digits
        int oddIndex = 0;
        int evenIndex = 0;

        // Construct the result by replacing digits with sorted ones
        for (char digit : num.toCharArray()) {
            if ((digit - '0') % 2 == 0) {
                result.append(evenDigits.get(evenIndex));
                evenIndex++;
            } else {
                result.append(oddDigits.get(oddIndex));
                oddIndex++;
            }
        }

        // Convert the result string to an integer using Integer.valueOf
        return Integer.valueOf(result.toString());
    }

    public static void main(String[] args) {
        LargNumAftSwap solution = new LargNumAftSwap();

        // Example 1
        String number1 = "1234";
        int largestNumber1 = solution.largestInteger(number1);
        System.out.println(largestNumber1);  // Output: 3412

        // Example 2
        String number2 = "65875";
        int largestNumber2 = solution.largestInteger(number2);
        System.out.println(largestNumber2);  // Output: 87655
    }
}

/*
 * https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/description/
 * However, this code inputs num as a string
 * Did not pass HackerRank though; error on converting to int
 * 
 * 
 * */
