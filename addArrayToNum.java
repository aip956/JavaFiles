import java.util.List;

public class addArrayToNum {
    
    public List<Integer> addToArrayForm(int[] num, int k) {
        // convert num to a number; mult each num by 10 and add
        // add k
        // convert back to array    
        

    }

    public integer convertToNum(int[] num) {
        // 2, 3, 4
        int number = 0;
        for (int el : num) {
            number = (el * 10) + number;
            System.out.println("number: " + number);
        } 

    }


    public static void main(String[] args) {
        int[] A = {1,2,0,0};
        int K = 34;
        System.out.println("Output: " + addArrayToForm(A, K));
    }


}
