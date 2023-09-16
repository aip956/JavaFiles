// https://leetcode.com/problems/simplify-path/submissions/

import java.util.*;

public class directoryPath {
    public static String simplifyPath(String path) {
        // parse by '/'
        // iterate through; if '.' do nothing
        // if '..' pop the last value
        // if other, shift '/' + val
        Stack <String> dirStack = new Stack<>();
        String[] pathArr =  path.split("/");
        // System.out.println("11: " + Arrays.toString(pathArr));
        for (String dir : pathArr) {
            if (dir.equals(".") || dir.equals("")) continue;
            else if (dir.equals("..")) {
                if (dirStack.isEmpty()) continue;
                else if (!dirStack.isEmpty()) dirStack.pop();
            } else {
                dirStack.push("/" + dir);
                System.out.println("18: " + dirStack);
            }
        }
        if (dirStack.size() == 0) return "/";
        else {
            StringBuilder sbPath = new StringBuilder();
            for (String dir : dirStack) {
                sbPath.append(dir);
            }
        return sbPath.toString();
        }
    
    }



    public static void main(String[] args) {
        String path1 = "/home/";
        System.out.println("Path1: " + simplifyPath(path1));
        String path2 = "/../";
        System.out.println("Path2: " + simplifyPath(path2));
    }

}
