import java.util.ArrayList;

public class reverseWords {
    static String reverseWords(String s) {
        String[] sArr = s.split("\\.");
        System.out.println(sArr[3]);
        ArrayList<String> outArr = new ArrayList<>();
        for (int i = sArr.length - 1; i >= 0; i--) {
            outArr.add(sArr[i]);
            System.out.println(outArr);
        }
        String result = String.join(".", outArr);

        return result;
    }
    



    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String output = reverseWords(s);
        System.out.println("Output: " + output); // Output: 
    }
}
