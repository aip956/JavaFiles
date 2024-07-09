class reverseInteger {
    public static int reverse(int x) {
        /*
        // get modulo num / 10; 
        // add to revNum*10
        num = 1234; num % 10 = 4
       rev = 10*0 + 4 = 4;
       num = num / 10;
       rev* 10 + mod = 43
       430 + 2 = 432
       4320+1
    
       123; 
       rev = 30
       rev = 320
       rev = 321
       */
        int modu;
        int revNum = 0;
        int negative = 1;
        if (x < 0) {
          negative = -1;
          x = Math.abs(x);
        }
    
        while (x > 0) {
          System.out.println("x: " + x);
          modu = x % 10; // 3; 2
          System.out.println("modu: " + modu);
          x = x/10; // 12
          System.out.println("x: " + x);
    
          // Check for out of bounds
          if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && modu > 7)) {
                  return 0;
              }
                
          revNum = (10 * revNum) + modu;
          System.out.println("revNum: " + revNum);
        }
        return negative * revNum;
    }
    
    
    
    public static void main(String[] args) {
        int num1 = 123;
        int output1 = reverse(num1);
        System.out.println("Output1: " + output1); // Output:
        int num2 = -123;
        int output2 = reverse(num2);
        System.out.println("Output2: " + output2); // Output:
        int num3 = 120;
        int output3 = reverse(num3);
        System.out.println("Output3: " + output3); // Output:
    }

}
    
    
/*
    * Given a 32-bit signed integer, reverse digits of an integer.
    * 
    * Example 00:
    * 
    * Input: 123
    * Output: 321
    * 
    * Example 01:
    * 
    * Input: -123
    * Output: -321
    * 
    * Example 02:
    * 
    * Input: 120
    * Output: 21
    * 
    120 % 10 = 0
    120 / 10 = 12
    12 % 10 = 2
    12 / 10 = 1
    1 % 10 = 1
    1 / 10 = 0
    * Note:
    * 
    * Assume we are dealing with an environment which could only store integers
    * within the 32-bit signed integer range: [−231, 231 − 1]. For the purpose of
    * this problem, assume that your function returns 0 when the reversed integer
    * overflows.
*/
    
