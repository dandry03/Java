public class HighScore {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        int highScore = 0;

        int seats = 0;

        System.out.print("Here are the scores: ");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(scores[i] + " ");

            if (scores[i] > highScore) {

                highScore = scores[i];
                seats = i;

            }

        }

        System.out.println("\n\nThe highest score is: " + highScore + " Impressive!");

        System.out.println("It's the lady in seat: " + seats + ". Give that gal a cookie!");
        
    }    

    public static Integer randomNumber() {

        double randomDouble = Math.random() * 50000;

        int randomInt = (int)randomDouble;

        return randomInt;

    }

}
