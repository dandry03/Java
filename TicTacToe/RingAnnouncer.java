public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.7).

        for (int i = 0; i < record.length; i++) {

            if (record[i] == "WIN") {

                wins++;

            } else {

                losses++;

            }

        }
        
        System.out.println("\nWith a professional record of " + wins + " wins and " + losses + " losses.");
        System.out.println("They is the pride of oracle: Java Fury!");


    }
}
