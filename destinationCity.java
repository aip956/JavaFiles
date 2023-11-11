import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class destinationCity {
        public static String destCity(List<List<String>> paths) {
            Set<String> citySet = new HashSet<>();
            for (int i = 0; i < paths.size(); i++) {
                citySet.add(paths.get(i).get(0));
            }

            for (int i = 0; i < paths.size(); i++) {
                if (!citySet.contains(paths.get(i).get(1))) {
                    return paths.get(i).get(1);
                }
            }
        return "-1";
        }


    public static void main(String[] args) {
        List<List<String>> paths1 = new ArrayList<>();
        paths1.add(new ArrayList<>(List.of("B","C")));
        paths1.add(new ArrayList<>(List.of("D","B")));
        paths1.add(new ArrayList<>(List.of("C","A")));
        
        List<List<String>> paths2 = new ArrayList<>();
        paths2.add(new ArrayList<>(List.of("London","New York")));
        paths2.add(new ArrayList<>(List.of("New York","Lima")));
        paths2.add(new ArrayList<>(List.of("Lima","Sao Paulo")));

        List<List<String>> paths3 = new ArrayList<>();
        paths3.add(new ArrayList<>(List.of("A","Z")));
        
        System.out.println("Destination1: " + destCity(paths1)); // A
        System.out.println("Destination2: " + destCity(paths2)); // Sao Paulo
        System.out.println("Destination3: " + destCity(paths3)); // Z
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

Time complexity: Loops through twice, O(2n) => O(n)
Space complexity: Created a set, O(n)
 * */
