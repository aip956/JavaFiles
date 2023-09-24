import java.util.*;

public class countDigs {
    public static int countDigits(int num) {
        int sum = 0;
        int remDigs = num % 10;
        while (remDigs > 0) {
            
            System.out.println("remDigs: " + remDigs);
            // System.out.println("remDigs: " + remDigs);
            if (num % remDigs == 0) {
                if (!sumsHash.contains(remDigs)) {
                    sum ++;
                    sumsHash.add(remDigs);
                    System.out.println("15sumsHash: " + sumsHash);
                    num = num / 10;
                }
                System.out.println("17sum: " + sum);
            }
            
            System.out.println("20num: " + num);
        }
        return sum;
    }

    public static void main(String[] args) {
        // int num1 = 7;
        // int result1 = countDigits(num1);
        // int num2 = 121;
        // int result2 = countDigits(num2);
        // System.out.println("Result1: " + result1);
        // System.out.println("Result2: " + result2);
        int num3 = 54;
        int result3 = countDigits(num3);
        System.out.println("Result3: " + result3);

    }
}
