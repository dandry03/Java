import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.

        System.out.print("Hi there! Choose a number to count to: ");

        int choice = scan.nextInt();

        System.out.println("Great! Here is how it's done"); 
        for(int i = 0; i <= choice; i++){
        
            System.out.println(i + " ");

        }

        scan.close();
    }
}
