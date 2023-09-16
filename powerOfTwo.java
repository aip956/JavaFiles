public class powerOfTwo {
    public static boolean isPowerofTwo(long n){
        int x = 0;
        double result = Math.pow(2, x);
        // 2*0 = 1; 2*1 = 2
        // 2*2 = 4
        // 2*3 = 8
        // n=6; x=3; res = 8
        while (result < n) {
            
            result = Math.pow(2, x);
            System.out.println(result+", "+ x +", " + n);
            x++;
        }
        return result == n;
        // Your code here
        
    }

    public static void main(String[] args) {
        long n = 1;
        boolean output = isPowerofTwo(n);
        System.out.println("Output: " + output); // Output: 
    }
    
}