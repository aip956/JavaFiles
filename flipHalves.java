


public class flipHalves {
    static String flipHalves(String str) {
        // CS123, 1234
        int frontStartInd;
        String middle = "";
        System.out.println("length: " + str.length());
        if (str.length() % 2 != 0) {
            frontStartInd = (str.length() / 2) + 1;
            System.out.println("9FrontStartInd: " + frontStartInd);
            middle = str.substring(frontStartInd - 1, frontStartInd);
            System.out.println("Middle: " + middle);
        } else {
            frontStartInd = (str.length() / 2);
            System.out.println("12FrontStartInd: " + frontStartInd);
        }
        String front = str.substring(frontStartInd);
        System.out.println("16front: " + front);
        String back = str.substring(0, str.length()/2);
        System.out.println("18back: " + back);
        return front+middle+back;
    }



    public static void main(String[] args) {
        String str = "CS123";
        // String str = "CS";
        String output = flipHalves(str);
        System.out.println("Output: " + output); // Output: 
    }
}
