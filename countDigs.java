import java.util.*;

public class countDigs {
    public static int countDigits(int num) {
        Set<Integer> sumsHash = new HashSet<>();
        int sum = 0;
        while (num > 0) {
            int mod = num % 10;
            System.out.println("mod: " + mod);
            System.out.println("num%mod: " + num%mod);
            if (num % mod == 0) {
                if (!sumsHash.contains(mod)) {
                    sum ++;
                    sumsHash.add(mod);
                    System.out.println("15sumsHash: " + sumsHash);
                }
                System.out.println("17sum: " + sum);
            }
            num = num / 10;
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
