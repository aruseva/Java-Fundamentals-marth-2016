/**
 * Problem 5.	Convert from decimal system to base-7
 * Write a program that takes an integer number and converts it to base-7
 */

import java.util.Scanner;

public class P05_ConvertToBase7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String intNumber = scan.next();
        System.out.println(Integer.toString(Integer.parseInt(intNumber, 10), 7));
    }
}
