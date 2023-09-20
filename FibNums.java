import java.util.*;


public class FibNums {
    public static long[] printFibb(int n){
        //Your code here
        ArrayList<Long> fibNums = new ArrayList<>();
        if (n == 1) {
            fibNums.add(1L);
        }
        else if (n >= 2) {
            fibNums.add(1L);
            fibNums.add(1L);
            for (int i = 2; i < n; i++) {
                long nextFib = fibNums.get(i - 2) + fibNums.get(i - 1);
                fibNums.add(nextFib);
            }
        }
        // convert array list to long[]
        long[] result = new long[fibNums.size()];
        for (int i = 0; i < fibNums.size(); i++) {
            result[i] = fibNums.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n1 = 5;
        long[] result1 = printFibb(n1);
        System.out.print("Output1: ");
        for (long num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int n2 = 10; // Changed to 10 to get more Fibonacci numbers
        long[] result2 = printFibb(n2);
        System.out.print("Output2: ");
        for (long num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
        
    }
}
