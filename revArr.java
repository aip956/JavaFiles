import java.sql.Array;
import java.util.*;

public class revArr {
    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    // start at ends; swap values, move in
    // only go half-way
    int half = a.size() / 2;

    System.out.println(half);
    int outside = a.size()-1;
    
    for (int i = 0; i < half; i++) {
        int temp = a.get(i);
        a.set(i, a.get(outside));
        a.set(outside, temp);
        outside--;
        System.out.println(a);
    }

        return a;
    }




    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Integer> output = reverseArray(arr);
        System.out.println("Output: " + output); // Output: 
    }
}
