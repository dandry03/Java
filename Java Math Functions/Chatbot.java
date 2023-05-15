import java.util.Scanner;

//import Scanner

public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        Scanner scanner = new Scanner(System.in);
        //set up scanner. 

        int counter = 0;

        System.out.println("\nHello. What is your name?");
        //Pick up user's name and store it. 
        String name = scanner.nextLine();

                           
        //add new a line before asking next question. 
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
        String city = scanner.nextLine();                

        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful in " + city + "! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        //Pick up age and store it.
        int age = scanner.nextInt();

        //add new a line before asking next question.
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("\nThis means I'm " + (400/age) + " times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python:P)");
        //Pick up language and store it. 
        String test = scanner.nextLine();
        String language = scanner.nextLine();

        //add new a line here.
        System.out.println("\n" + language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        //close scanner. 

        
    }
}
