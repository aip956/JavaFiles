import java.util.ArrayList;
import java.util.Scanner;

public class multsOfThreeFive {
        public static void main(String[] args) {
            int arr[] = {2, 10, 100};


        for(int a0 = 0; a0 < arr.length; a0++){
            int n = arr[a0];
            System.out.println("10n: " + n);
            int sum = getSumOfMultsBelN(n, 3) + getSumOfMultsBelN(n, 5) - getSumOfMultsBelN(n, 15);
            // for (int i = 1; i < n; i++) {
            //     if (i % 5 == 0 || i % 3 == 0) {
                    
            //         // System.out.println("18n: " + n);
            //         // System.out.println("19i: " + i);
            //         sum += i;
            //         // System.out.println("sum: " + sum);
            //     }
            // }

            System.out.println(sum);
        }
    }
    public static int getSumOfMultsBelN(int n, int x) {
        // System.out.println("x: " + x);
        int k = (n - 1) / x;
        // System.out.println("k: " + k);
        // System.out.println("30: "+ x * (k * (k + 1)) / 2);
        return x * (k * (k + 1)) / 2;
    }
}
