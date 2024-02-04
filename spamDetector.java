import java.util.*;

public class spamDetector {
    public static List<String> getSpamEmails(List<String> subjects, List<String> spam_words) {    
        List<String> result = new ArrayList<>();
        for (String subject : subjects) {
            subject.toLowerCase();
            int counter = 0;
            for (String word : spam_words) {
                word.toLowerCase();
                if (subject.contains(word)) {
                    counter++;
                }
                System.out.println("Subject: " + subject);
                if (counter >= 2) {
                    result.add("Spam");
                    System.out.println("is spam");
                } else {
                    System.out.println("Not spam");
                }
            }
        }
        


        return result;
    }

    public static void main(String[] args) {
        
        List<String> subjects = List.of("free prize worth millions", "ten tips for a carefree lifestyle");
        List<String> spamWords = List.of("free", "money", "win", "millions");
        System.out.println(getSpamEmails(subjects, spamWords));

    }
}


/*
public static List<String> getSpamEmails(List<string> subjects, List<string> spam_words) {

}
counter = 0; will count the number of spam words in email subj
iterate over email subj, for each email
for each spam word
if it is in the subject, counter ++

 * Implement a prototype of an email spam detection algo
For simulation, subjects of n emails and k spam words are given in two arrays of strings, subjects, and spam_words. An email is considered spam if it contains at least two spam words in the subject. If a spam word is repeated, it counts as to the email is considered spam. The spam words are not case-sensitive

Give subjects and spam_words, return an array of n strings, "spam" or "Not_spam", one for each subject

Ex:
suppose subjects = ["free prize worth millions", "ten tips for a carefree lifestyle"] and spam_words = ["free", "money", "win", "millions].

Subject: Free prize worth millions
Spam words: Free, millions
Answer: Spam

Subject ten tips for a carefree lifestyle
Spam words:
Answer: Not_spam

Function Description
complete the function getSpamEmails in the editor below
GetSpamEmails takes the following arguments:
String subjects[n]: the subjects in the email
string spam_words[n]: the spam words

Returns: string[n]: the resutls of spam detection

Constraints 
1 <=n <= 10**3
1 <= k <= 10**5
1 <= |subjects[i]| <= 10**5
1 <= |spam_words[i]| <= 10**5
It is guaranteed that the subjects and spam words consist of lowercase and uppercase english letters and spaces only

 */