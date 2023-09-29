public class bestDayRobBank {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int[] output = {};
        if (security.length < 1 + (2*time)) {
            return output;
        }
        // have to consider time is large
        
        for (int i = 2; i < security.length - time; i++) {
            if (security[i - time] >= security[i - time+1])
        }
        return output;
    }



    public static void main(String[] args) {
        int[] security1 = {5,3,3,3,5,6,2};
        int time1 = 2;
        System.out.println("Output1: " + goodDaysToRobBank(security1, time1));
    }


}
