public class minNumOfJumps {
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length;
        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;

        


        return -1;
    }

    public static void main(String[] args) {
        int N = 11;
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("Output: " + minJumps(arr));
    }
}
