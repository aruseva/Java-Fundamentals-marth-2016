/**
 * Problem 8.	*Odd and Even Pairs
 * You are given an array of integers as a single line, separated by a space.
 * Write a program that checks consecutive pairs and prints if both are odd/even or not.
 * Note that the array length should also be an even number
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P08_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strInput = scan.nextLine().trim();
        List<Integer> myList = new ArrayList<>();

        Pattern reg = Pattern.compile("([0-9])+");
        Matcher m = reg.matcher(strInput);
        while (m.find()) {
            myList.add(Integer.parseInt(m.group()));
        }
        if (myList.size() % 2 == 0) {
            int i = 0;
            for (; i < myList.size(); i = i + 2) {
                if (myList.get(i) % 2 == 0 && myList.get(i + 1) % 2 == 0) {
                    System.out.printf("%s,%s -> both are even", myList.get(i), myList.get(i + 1));
                } else if (myList.get(i) % 2 != 0 && myList.get(i + 1) % 2 != 0) {
                    System.out.printf("%s,%s -> both are odd", myList.get(i), myList.get(i + 1));
                } else {
                    System.out.printf("%s,%s -> different", myList.get(i), myList.get(i + 1));
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid length");
        }
    }
}
