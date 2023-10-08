import java.util.*;

public class wordGuess {
    public static void main(String[] args){
        String[] wordsArr = {"apple, queue, mayor, nicer, story"};
        Random random = new Random();
        int randomNum = random.nextInt(5);
        String gameWord = wordsArr[randomNum];
        
        Scanner scanner = new Scanner(System.in);  
        int max_guesses = 7;
        int guessInWord = 0;
        while (max_guesses <= 7 && guessInWord < 5)

        System.out.println("Enter a letter");
        char guess = scanner.next().charAt(0);
        System.out.println(guess);


        scanner.close();
    }

}
