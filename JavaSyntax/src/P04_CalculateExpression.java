/**
 * Problem 4.	Calculate expression
 * Write a program that reads three floating point numbers from the console and calculates their result with the following formulae:
 * ((a2 + b2) / (a2 – b2))(a + b + c) / √c             (a2 + b2 - c3)(a – b)
 * Then calculate the difference between the average of the three numbers and the average of the two formulae.
 * Average (a, b, c) – Average (f1, f2)
 */

import java.util.Scanner;

public class P04_CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        System.out.printf("F1 result is: %.2f%s",firstFormula(a, b, c) , "; " );
        System.out.printf("F2 result is: %.2f%s",secondFormula(a, b, c), "; " );

        System.out.printf("Diff result is: %.2f", Math.abs((Average(a, b, c) - Average(firstFormula(a, b, c), secondFormula(a, b, c), 0))));
    }

    public static double firstFormula(double a, double b, double c) {
        double base, pow;
        base = ((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2)));
        pow = (a + b + c) / Math.sqrt(c);

        return Math.pow(base, pow);


    }

    public static double secondFormula(double a, double b, double c) {
        double base, pow;
        base = Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3);
        pow = (a - b);

        return Math.pow(base, pow);
    }

    public static double Average(double a, double b, double c) {
        if (c == 0) {
            return (a + b + c) / 2;
        }
        return (a + b + c) / 3;
    }

}
