public class missingNumInArray {
    public static int missingNumber(int array[], int n) {
        // Your Code Here
        // 1,2,3,4,5
        // get sum of arr; 15
        // expectedSum = 5*6 / 2, or n*(n+1)/2
        // missing num = expSum - sum
        int sumArr = 0;
        int expSum = n * (n+1) / 2;
        for (int element : array) {
            sumArr += element;
        }
        int missing = expSum - sumArr;
        return missing;
    }



    public static void main(String[] args) {
        // int N = 5;
        // int arr[] = {1,2,3,5};
        int N = 10;
        int arr[] = {6,1,2,8,3,4,7,10,5};
        System.out.println("Output1: " + missingNumber(arr, N));
    }
}
