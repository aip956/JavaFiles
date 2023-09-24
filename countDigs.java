public class countDigs {
    public int countDigits(int num) {
        int sum = 0;
        while (num >= 0) {
            int mod = num % 10;
            System.out.println("mod: " + mod);
            if (num % mod == 0) {
                sum ++;
                System.out.println("sum: " + sum);
            }
            num = num / 10;
            System.out.println("11num: " + num);
        }
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 7;
        System.out.println("Result1: " + countDigs(num1));
    }
}
