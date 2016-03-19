/**
 * Problem 8.	**Get Average
 * Create a method that finds the average of three numbers.
 * Read in internet about java methods. Check the naming conventions.
 * Invoke your method and test it. Format the output to two digits after the decimal separator. The placeholder is %.2f
 */

import java.util.Locale;
import java.util.Scanner;

public class P8GetAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);

        double firstDouble = scan.nextDouble();
        double secondDouble = scan.nextDouble();
        double threeDouble = scan.nextDouble();

       System.out.printf("%.2f", Average(firstDouble, secondDouble, threeDouble));
    }

    public static double Average(double firstDouble, double secondDouble, double threeDouble) {
        double dblAver = (firstDouble + secondDouble + threeDouble) / 3;
        return dblAver;
    }
}
