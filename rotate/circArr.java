import java.util.*;

class circArr {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        int n = a.size();
        k = k % n;
        List<Integer> result = new ArrayList<>();

        // Process queries based on new rotation
        for (int q : queries) {
            int newIndex = (q - k + n) % n;
            result.add(a.get(newIndex));
        }
        return result;
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read n, k, q
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();

        // read the array
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        // Read queries
        List<Integer> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(scanner.nextInt());
        }

        // Call function 
        List<Integer> result = circularArrayRotation(a, k, queries);

        // Print output; each query on next line
        for (int val : result) {
            System.out.println(val);
        }

        // Close scanner
        scanner.close();
    }
}





/*
{1, 2, 3, 4, 5, 6, 7}; k = 3
int newIndex = (q - k + n) % n;
q = 0; new Index = (0 - 3 + 7) % n = 4 % 7 = 4
q = 1; new Index = (1 - 3 + 7) % n = 5 % 7 = 5
q = 2; new Index = (2 - 3 + 7) % n = 6 % 7 = 6
q = 3; new Index = (3 - 3 + 7) % n = 7 % 7 = 0
q = 4; new Index = (4 - 3 + 7) % n = 8 % 7 = 1
q = 5; new Index = (5 - 3 + 7) % n = 9 % 7 = 2
q = 6; new Index = (6 - 3 + 7) % n = 10 % 7 = 3
q = 7; new Index = (7 - 3 + 7) % n = 11 % 7 = 4

https://www.hackerrank.com/challenges/circular-array-rotation/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * John Watson knows of an operation called a right circular rotation on an array of integers. 
 * One rotation operation moves the last array element to the first position and shifts all 
 * remaining elements right one. To test Sherlock's abilities, Watson provides Sherlock with 
 * an array of integers. Sherlock is to perform the rotation operation a number of times 
 * then determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the values of the elements at the given indices.

Example



Here  is the number of rotations on , and  holds the list of indices to report. First we perform the two rotations: 

Now return the values from the zero-based indices  and  as indicated in the  array.


Function Description

Complete the circularArrayRotation function in the editor below.

circularArrayRotation has the following parameter(s):

int a[n]: the array to rotate
int k: the rotation count
int queries[1]: the indices to report
Returns

int[q]: the values in the rotated  as requested in 
Input Format

The first line contains  space-separated integers, , , and , the number of elements in the integer array, the rotation count and the number of queries.
The second line contains  space-separated integers, where each integer  describes array element  (where ).
Each of the  subsequent lines contains a single integer, , an index of an element in  to return.

Constraints

Sample Input 0

3 2 3
1 2 3
0
1
2
Sample Output 0

2
3
1

 */