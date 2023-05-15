import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.5 to access the link).

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nWelcome to JavaGram! Let's sign you up.");
        
        System.out.println("\nWhat is your first name?");
        int counter = 0;
        String firstName = scanner.nextLine();
        
        System.out.println("\nWhat is your last name?");
        counter++;
        String lastName = scanner.nextLine();

        System.out.println("\nHow old are you?");
        counter++;
        int age = scanner.nextInt();

        System.out.println("\nMake a username");  
        // If you experience trouble picking up the username, please carefully read the instructions on Learn the Part.
        counter++;
        String username = scanner.nextLine();
        String userName = scanner.nextLine();
        
        System.out.println("\nWhat city do you live in?");
        counter++;
        String city = scanner.nextLine();

        System.out.println("\nWhat country is that?");
        counter++;
        String country = scanner.nextLine();
        
        System.out.println("\nThank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + userName);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        //close scanner. It's good practice :D ! 
    }
}
