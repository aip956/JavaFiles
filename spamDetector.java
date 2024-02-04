import java.util.*;

public class spamDetector {
    public static String[] getSpamEmails(String[] subjects, String[] spamWords){
        String result = new String[subjects.length];



        return result;
    }

    public static void main(String[] args) {
        String[] subjects = {"free prize worth millions", "ten tips for a carefree lifestyle"};
        String[] spamWords = {"free", "money", "win", "millions"};
        System.out.println(getSpamEmails(subjects, spamWords));

    }
}
