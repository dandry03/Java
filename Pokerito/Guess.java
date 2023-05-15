import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       
       //See Learn the Part for detailed instructions.
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");

       int userGuess = scan.nextInt();

       int compGuess = (int)Math.floor(Math.random() * (5 - 1 + 1) + 1);

       while (userGuess != compGuess) {

        userGuess = scan.nextInt();

       }

        scan.close();
    }

}
