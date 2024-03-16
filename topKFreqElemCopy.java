public class topKFreqElemCopy {
    public static int[] topKFrequent(int[] nums, int k) {
        
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] output = topKFrequent(nums, k);
        for (int i = 0; i < k; i++) {
            System.out.print(output[i]);
        }
    }
}

