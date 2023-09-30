




public class bestDayRobBank {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        ArrayList<Integer> output = new ArrayList<>();
        if (security.length < 1 + (2*time)) {
            return output;
        }
        // have to consider time is large

        for (int i = time; i < time-1; i++) {
            if (security[i-time] > security[i-time+1]) {
                break;
            }
            for (int i = time; i < security.length - time; i++) {
                if (security[i] > security[i+1]) {
                    break;
                }
            }
            ouput
        }
        
        return output;
    }



    public static void main(String[] args) {
        int[] security1 = {5,3,3,3,5,6,2};
        int time1 = 2;
        System.out.println("Output1: " + goodDaysToRobBank(security1, time1));
    }


}
