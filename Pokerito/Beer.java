public class Beer {
    public static void main(String[] args) {
       // See detailed instructions on Learn the Part.
       for (int i = 99; i > 0; i-- ) {

        sing(i);

       }

    }

       public static void sing(int i) {

        System.out.println( i + " bottles of beer on the wall, " + i + " bottles of beer!");
        System.out.println("Take one down and pass it around " + (i - 1) + " bottles of beer on the wall!");

    }

    

}