import java.util.*;

public class spamDetector {
    public static List<String> getSpamEmails(List<String> subjects, List<String> spam_words) {    
        
        List<String> result = new ArrayList<>();
        
        


        return result;
    }

    public static void main(String[] args) {
        String[] subjects = {"free prize worth millions", "ten tips for a carefree lifestyle"};
        String[] spamWords = {"free", "money", "win", "millions"};
        System.out.println(getSpamEmails(subjects, spamWords));

    }
}
