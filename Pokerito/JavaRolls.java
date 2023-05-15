import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        
        int diceRoll = rollDice();
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start. ");
        String play = scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println("If you roll a 6, the game stops.");
        System.out.println("If you roll a 4, nothing happens.");
        System.out.println("Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");
        String rolling = scan.nextLine();

        while (true) {

            rolling = scan.nextLine();

            diceRoll = rollDice();

            System.out.println("You rolled a " + diceRoll);

            if(diceRoll == 6) {
                System.out.println("End of game");
                break;
            } else if (diceRoll == 4) {
                System.out.println("0 points. Keep rolling.");
            } else {
                score ++;
                System.out.println("1 point. Keep rolling.");
            }

        }

        scan.close();

        if (score >= 3) {
            System.out.println("Your score is: " + score);
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Your score is: " + score);
            System.out.println("Tough luck, you lose :()");
        }

    }

    public static Integer rollDice(){

        int randomNumber = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);

        return randomNumber;

    }
  
  

  
  
}
