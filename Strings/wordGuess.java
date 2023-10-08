import java.util.*;

public class wordGuess {
    public static void main(String[] args){
        // Create array of words, random number gen, to get secret word
        String[] wordsArr = {"apple", "queue", "mayor", "nicer", "story"};
        System.out.println("wordsArr[0]: " + wordsArr[0]);
        Random random = new Random();
        int randomNum = random.nextInt(5);
        System.out.println("RandomNum: " + randomNum);
        String gameWord = wordsArr[randomNum];
        System.out.println("gameWord: " + gameWord);
        int length = gameword.length();
        System.out.println("length: " + length);

        Scanner scanner = new Scanner(System.in);  
        int max_guesses = 7;
        int guessInWord = 0;
        while (max_guesses <= 7 && guessInWord < 5) {
            System.out.println("Enter a letter");
            char guess = scanner.next().toLowerCase().charAt(0);
            System.out.println(guess);
            if (guess >= 'a' && guess <= 'z') {
                System.out.println("guess valid");
                for (int i = 0; i < length; i++) {
                    if (guess == gameWord.charAt(i)) {
                        System.out.println("guess found at index: " + i);
                        guessInWord++;
                    }
                }
            } else {
                System.out.println("Guess invalid; please enter a letter");
            }
            
            
            max_guesses --;
            
        }

        


        scanner.close();
    }

}
