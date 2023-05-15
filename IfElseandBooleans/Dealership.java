import java.util.Scanner;

//import javax.swing.DefaultRowSorter;

public class Dealership {
        public static void main(String[] args) {
                
                Scanner scan = new Scanner(System.in);

                System.out.println("Welcome to the Java Dealership where all your car dreams will come true.");

                System.out.println("Select option 'a' to buy a car.");

                System.out.println("Select option 'b' to sell a car.");

                String option = scan.nextLine();

                switch(option) {
                        case "a": 
                                System.out.println("What is your budget?"); 
                                int budget = scan.nextInt();
                                if(budget >= 10000) {
                                        System.out.println("Great a Lexus is available!");
                                        System.out.println("\nDo you have insurance? Write 'yes' or 'no' ");
                                        String insurance = scan.next();

                                        System.out.println("\nDo you have a driver's license? Write 'yes' or 'no' ");
                                        String license = scan.next();

                                        System.out.println("\nWhat is your credit score?");
                                        int creditScore = scan.nextInt();

                                        if(insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                                                System.out.println("\nSold! Pleasure doing business with you!");
                                        } else {
                                                System.out.println("\nWe're sorry. You're not eligible.");
                                        }
                                } else {
                                        System.out.println("\nWe don't sell cars under $10,000. Sorry.");
                                }
                        case "b": System.out.println("you chose option " + option); 
                                System.out.println("\nWhat is your car valued at?");
                                int value = scan.nextInt();

                                System.out.println("\nWhat is your selling price?");
                                int price = scan.nextInt();

                                if(value > price && price < 30000) {
                                        System.out.println("\nWe will buy your car. A pleasure doing business with you.");
                                } else {
                                        System.out.println("\nSorry. We're not interested.");
                                }

                        default: System.out.println("invalid option");
                }
                scan.close();

        }
}
