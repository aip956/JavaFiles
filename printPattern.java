import java.util.ArrayList;
import java.util.List;

public class printPattern {
        public static List<Integer> pattern(int N){
        // code here
        List<Integer> list = new ArrayList<>();
        list.add(N);
        
        if (N <= 0) {
            return list;
        } else {
            list.addAll(pattern(N - 5));
            list.add(N);
            return list;
        }
    }

    public static void main(String[] args) {
        int n1 = 16;
        System.out.println("Output1: " + pattern(n1));
    }
}


/*
 * https://www.geeksforgeeks.org/problems/print-pattern3549/1
 * Print a sequence of numbers starting with N, without using 
 * loop, where replace N with N - 5, until N > 0. After that 
 * replace N with N + 5 until N regains its initial value.
 * 
 * use recursive
 * if n > 0, add n-5 to list; decrease n by 5
 * 
 */