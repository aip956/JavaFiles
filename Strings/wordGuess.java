import java.util.*;

public class wordGuess {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter a letter");
        char guess = scanner.next().charAt(0);
        System.out.println(guess);

        scanner.close();
    }

}
