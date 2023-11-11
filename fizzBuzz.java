import java.util.*;

public class fizzBuzz {
    
    public static void fizzBuzz(int n) {
        // Write your code here
            for (int i = 1; i <= n; i++) {
                // System.out.println(n);
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if( i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                } 
            }
    }


    public static void main(String[] args) {
        int n = 15;
        fizzBuzz(n);
    }

}
