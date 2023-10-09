import java.util.*;

public class wordGuess {
    public static void main(String[] args){
        // Create array of words, random number gen, to get secret word
        String[] wordsArr = {"apple", "queue", "mayor", "nicer", "story"};
        Random random = new Random();
        int randomNum = random.nextInt(5);
        System.out.println("RandomNum: " + randomNum);
        String gameWord = wordsArr[randomNum];
        System.out.println("gameWord: " + gameWord);
        int length = gameWord.length();
        System.out.println("length: " + length);
        char[] guessedOutput = new char[length];
        // Create output display array
        for (int i = 0; i < length; i++) {
            guessedOutput[i] = '_';
        }
        System.out.println("guessedOutput: " + String.join(" ", String.valueOf(guessedOutput)));
        

        Scanner scanner = new Scanner(System.in);  
        int max_guesses = 7;
        int guessInWord = 0;
        while (max_guesses >= 0 && guessInWord < length) {
            System.out.println("Guesses left: " + max_guesses);
            System.out.println("Enter a letter");
            char guess = scanner.next().toLowerCase().charAt(0);
            System.out.println(guess);
            if (guess >= 'a' && guess <= 'z') {
                System.out.println("guess valid");
                for (int i = 0; i < length; i++) {
                    if (guess == gameWord.charAt(i)) {
                        System.out.println("guess found at index: " + i);
                        guessedOutput[i] = guess;
                        guessInWord++;
                        System.out.println("Correct letters found " + guessInWord);
                    }
                }
            } else {
                System.out.println("Guess invalid; please enter a letter");
            }
            System.out.println("guessedOutput: " + String.join(" ", String.valueOf(guessedOutput)));
            if (guessInWord == length) {
                System.out.println("You guessed it!");
                return;
            }
            max_guesses --;
        }
        if (max_guesses == 0) {
            System.out.println("Too many guesses; the word was: " + gameWord);
        }

        scanner.close();
    }

}
