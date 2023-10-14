public class hiddenString {
    public static boolean hidenp(String s1, String s2) {
        if (s1.length() == 0) return true;
        int p1 = 0;
        int p2 = 0;
    
        for (int i = 0; i < s1.length(); i++) {
          boolean found = false;
            for (int j = p2; j < s2.length(); j++) {
              System.out.println("48i: " + i);
              System.out.println("51j: " + j);
              System.out.println("52s1charAt(i): " + s1.charAt(i));
              System.out.println("53s2charAt(j): " + s2.charAt(j));
              if (s1.charAt(i) == s2.charAt(j)) {
                System.out.println("55s1chari == s2charj");
                p2 = j + 1;
                System.out.println("57p2: " + p2);
                found = true;
                break;
              }
            System.out.println("60found: " + found);
          }
        if (!found) return false;
        }
        return true;
      }


    class Main {
        public static void main(String[] args) {
          String i1a = "fgex.;";
          String i1b = "tyf34gdgf;'ektufjhgdgex.;.;rtjynur6";
          System.out.println(hidenp(i1a, i1b));  // expected value: True
          String i2a = "abc";
          String i2b = "btarc";    
          System.out.println(hidenp(i2a, i2b)); // expected value: False
          String i3a = "";
          String i3b = "long string ?ddl";
          System.out.println(hidenp(i3a, i3b));    // expected value: True
        }
}
