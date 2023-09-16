import java.util.List;
import java.util.ArrayList;

public class compTrip {
       public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                int currentVal = result.get(0);
                currentVal ++;
                result.set(0, currentVal);
            }
            else if (a.get(i) < b.get(i)) {
                int currentVal = result.get(1);
                currentVal ++;
                result.set(1, currentVal);
            }
            System.out.println(result);
        }
        return result;
    }


public static void main(String[] args) {
    List<Integer> a =  new ArrayList<>(List.of(1, 2, 3));
    List<Integer> b = new ArrayList<>(List.of(3, 2, 1));
    List<Integer>  output = compareTriplets(a, b);
    System.out.println("Output: " + output); // Output: 
}


}
