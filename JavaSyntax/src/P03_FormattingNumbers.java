/**
 * Problem 3.	Formatting Numbers
 * Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a floating-point b and a floating-point c and prints them in 4 virtual columns on the console.
 * Each column should have a width of 10 characters. The number a should be printed in hexadecimal, left aligned;
 * then the number a should be printed in binary form, padded with zeroes, then the number b should be printed with 2 digits after the decimal point, right aligned;
 * the number c should be printed with 3 digits after the decimal point, left aligned.
 */

import java.util.Scanner;

public class P03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        System.out.printf(String.format("|%-10X|", a));
        System.out.printf(String.format("%010d", Integer.parseInt(Integer.toString(a, 2).replace(' ', '0'))));
        System.out.printf(String.format("|%10.2f|%-10.3f|", b, c));
    }
}
