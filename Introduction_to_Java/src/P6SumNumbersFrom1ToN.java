
/**
 * Problem 6.	 Sum numbers from 1 to N
 * Create a Java program that reads a number N from the console and calculates the sum of all numbers from 1 to N (inclusive).
 */

import java.util.Scanner;

public class P6SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intNumber = Integer.parseInt(scanner.next());
        int intSum = 0;
        for (int i = 1; i <= intNumber; i++) {
            intSum += i;
        }
        System.out.println(intSum);
    }
}
