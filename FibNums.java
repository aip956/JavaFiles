


public class FibNums {
    public static long[] printFibb(int n){
        //Your code here
        Array<Long> fibNums = new Array<>();
        if (n == 1) {
            fibNums = {1};
        }
        else if (n >= 2) {
            fibNums = {1, 1};
            for (int i = 2; i < n; i++) {
                fibNums[i] = {fibNums[i - 2] + fibNums [i - 1]}
            }
        }
        return fibNums;
    }

    public static void main(String[] args) {
        int n1 = 5;
        System.out.println("Output1: " + (printFibb(n1)));
        int n2 = 5;
        System.out.println("Output1: " + (printFibb(n2)));
        
    }
}
