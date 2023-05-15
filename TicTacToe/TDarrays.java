import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        
        int[][] grades = {
            {72,74,78,76},
            {65,64,61,67},
            {95,98,99,100}
        };
       
        //for (int j = 0; j < grades[0].length; j++) {

            //System.out.print(grades[0][j] + " "); //[0][0], [0][1], [0][2]

       // }

        //System.out.println("\n");
        //for (int j = 0; j < grades[1].length; j++) {

            //System.out.print(grades[1][j] + " ");

        //}

        for (int i = 0; i < grades.length; i++) {

            switch (i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1:System.out.print("\tRon"); break;
                case 2:System.out.print("\tHermione: "); break;
            }

            for (int j = 0; j < grades[i].length; j++) {

                System.out.print(grades[i][j] + " ");

            }

            System.out.println("\n");
        }

        

    }
}
