public class FizzBuzz {
    public static void main(String[] args) {

        // See Learn the Part for detailed instructions.

        for (int i = 0; i <= 18; i += 1) { 

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println( i + " FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            }

        }

    }

}
