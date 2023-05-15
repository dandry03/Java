import java.util.Arrays;

import javax.management.openmbean.CompositeDataInvocationHandler;

public class Weather {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celsius);

        System.out.println(Arrays.toString(fahrenheit));
        
    }

    /**
 * Function name: celciusToFahrenheit.
 * @param celsius ( double[] )
 * @return fahrenheit ( double[] )
 *
 * Inside the function:
 *     1. Creates a double[] array called 'fahrenheit'.
 *     2. Copies all the values from celsius to fahrenheit.
 *     3. Updates the fahrenheit values (F = (C/5 * 9) + 32).
 *     4. return fahrenheit.
 */

    public static double[]celciusToFahrenheit(double[] celcius) {

        double[] fahrenheit = new double[celcius.length];

        //fahrenheit = Math.pow((celcius[] / 5 * 9) + 32); 

        for(int i = 0; i < celcius.length; i++) {

            fahrenheit[i] = (celcius[i] / 5 * 9) + 32; 

        }
        
        return fahrenheit;

    }

}
