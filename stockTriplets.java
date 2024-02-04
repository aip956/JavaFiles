import java.util.*;

public class stockTriplets {
    public static int getTripletCount(List<Integer> arr, int d) {
        int count = 0;
        Collections.sort(arr);
        System.out.println("arr: " + arr);
        int length = arr.size();
        for (int i = 0; i < length - 2; i++) {
            for (int j = i+1; j < length - 1; j++) {
                for (int k = j+1; k < length; k++) {
                    int sum = arr.get(i) + arr.get(j) + arr.get(k);     
                    if (sum % d == 0) {
                        count ++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3,3,4,7,8);
        int d = 5;
        System.out.println(getTripletCount(arr, d));

    }
}



/*
sort the array
iterate through all possible triplets
i, j, k
j = i + 1
k = j + 1
 * The cost of a stock on each day is given in an array arr. 
 * An investor wants to buy the stocks in triplets such that 
 * the sum of the cost for three days is divisible by d. 
 * The goal is to find the number of distinct triplets (i, j, k) 
 * such that i<j<k and the sum (a[i]+a[j]+a[k] is divisible by d

Ex; arr; [3,3,4,7,8] and d=5. Following are the triplets whose 
sum is divisible by d(1-based indexing):

Triplet with indices (1,2,3), sum = 3+3+4 which is equal to 10
Triplet with indices (1,3,5), sum = 3+4+8 = 15
Triplet with indices (2,3,4), sum = 3+4+8 = 15
Hence the answer is 3
Prototype:
Public static int getTripletCount(List<Integer> arr, int d) {
}



for (int i = 0; i < arr.size() - 2; i++) {
            int left = i + 1;
            int right = arr.size() - 1;
            System.out.println("i: " + i);
            System.out.println("arr.get(i): " + arr.get(i));
            System.out.println("left: " + left);
            System.out.println("arr.get(left): " + arr.get(left));
            System.out.println("right: " + right);
            System.out.println("arr.get(right): " + arr.get(right));
            while (left <= right) {
                int sum = arr.get(i) + arr.get(left) + arr.get(right);
                System.out.println("sum: " + sum);
                if (sum % d == 0) {
                    count ++;
                } 
                if (sum <= d) {
                    left ++;
                } else {
                    right --;
                }
            }
        }
 */