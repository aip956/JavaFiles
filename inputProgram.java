import java.util.Scanner;

public class inputProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstname = input.next();

        System.out.print("Enter last name: ");
        String lastname = input.next();

        System.out.println("Hello "+firstname+" "+lastname);

        input.close();
    }
}
