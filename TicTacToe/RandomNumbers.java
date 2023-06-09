public class RandomNumbers {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.14)
        // Task 3 – Create a 2D array with 100 rows and 10 columns.
        int[][] array = new int[100][10];


        /** Task 4
         * 
         * 1. Using a nested loop, populate the array with random numbers. 
         * 2. Then, pass the updated array into print2DArray.  
         * 
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomNumber();
            }
        }
        print2DArray(array);

    }

    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
        
    }

    /**
 * Function name: print2DArray
 * @param array ( int[][] )
 *
 * Inside the function:
 *  1. Nested loop:
 *      - Inner Loop: System.out.print(array[i][j] + " ");
 *      - After the Inner Loop Completes: System.out.print("\n");
 */

    public static void print2DArray (int[][] array) {


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.print("\n");

        }
        
    }

}
