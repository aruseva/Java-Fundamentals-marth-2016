/**
 * Problem 11.	 Get First Odd or Even Elements
 * Write a method that returns the first N odd/even elements from a collection. Return as many as you can.
 * Format: [Get <number of elements> <odd/even>]
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class P11_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] command = scan.nextLine().split(" ");

        for (int i = 0, count = 0; i < numbers.size(); i++) {
            if (Integer.parseInt(command[1]) <= count) {
                break;
            }
            if ((command[2].equals("even")) && (numbers.get(i) % 2 == 0)) {
                count++;
                System.out.print(numbers.get(i) + " ");
            } else if ((command[2].equals("odd")) && (numbers.get(i) % 2 > 0)) {
            count++;
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}

