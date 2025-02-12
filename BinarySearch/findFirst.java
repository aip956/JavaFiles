import java.util.*;

public class findFirst {
// 1,2,3,4,5
    public static int findBoundary(List<Boolean> arr) {
        // go to mid; if == true, dump right side 
        int right = arr.size() - 1; // 4
        int left = 0;    
        int boundaryInd = -1;
        
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == true) { // also if (arr.get(mid))
                // f, t, t, t, t
                // t, t, t, /t, t
                // f, f, t, / t, t
                boundaryInd = mid; // store potential first true
                right = mid - 1; // Look for earlier true
            } else {
                // f, f,/ f, t, t
                // f, f,/ f, f, f
                left = mid + 1; // Move right to search
            }
        }
    return boundaryInd;
    }

    public static void main(String[] args) {
        // List<Boolean> arr = Arrays.asList(false, false, true, true, true);
        // List<Boolean> arr = Arrays.asList(false, false, false, false);
        List<Boolean> arr = Arrays.asList(true, true, true, true, true);

        System.out.println(findBoundary(arr));
    }
}



/*
An array of boolean values is divided into two sections: 
The left section consists of all false, and the right 
section consists of all true. Find the First True in a 
Sorted Boolean Array of the right section, 
i.e., the index of the first true element. If there is 
no true element, return -1.

Input: arr = [false, false, true, true, true]

Output: 2

Explanation: The first true's index is 2.
 */