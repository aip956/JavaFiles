import java.util.List;

public class destinationCity {
        public String destCity(List<List<String>> paths) {
        
    }


    public static void main(String[] args) {
        String[] paths1 = {{"B","C"},{"D","B"},{"C","A"}};
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
