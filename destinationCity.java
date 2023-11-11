import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class destinationCity {
        public String destCity(List<List<String>> paths) {
            Set<String> dest = new HashSet<>();
            for (int i = 0; i < paths.length; i++) {
                Set.put(paths[i][0]);
            }
    }


    public static void main(String[] args) {
        List<List<String>> paths1 = {{"B","C"},{"D","B"},{"C","A"}};

        String[][] paths2 = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
        String[][] paths3 = {{"A","Z"}};
        System.out.println("Destination1: " + destCity(paths1));
        System.out.println("Destination2: " + destCity(paths2));
        System.out.println("Destination3: " + destCity(paths3));
    }
}


/*
 * https://leetcode.com/problems/destination-city/
 * Create a set
itereate through paths[i][0]; 
add paths[i][0] to set
iterate through paths[i][1]
if path[i][1] is in set, keep going
if not in set, return path[i][1]
 * */
