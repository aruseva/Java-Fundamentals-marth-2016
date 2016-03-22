/**
 * Problem 7.	Randomize numbers from N to M
 * Write a program that takes as input two integers N and M, and randomizes the numbers between them.
 * Note that M may be smaller than or equal to N.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P07_RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbN = scan.nextInt();
        int numbM = scan.nextInt();
        List<Integer> myList = new ArrayList<>();
        int diff = Math.abs(numbN - numbM);
        if (numbN > numbM) {
            int tmpNumb = numbN;
            numbN = numbM;
            numbM = tmpNumb;
        }
        while (true) {
            Random r = new Random();
            int randomNum = r.nextInt(diff + 1) + numbN;
            if (myList.contains(randomNum) == false) {
                myList.add(randomNum);
            }
            if (myList.size() >= diff + 1) {
                break;
            }
        }
        for (int item : myList) {
            System.out.print(item + " ");
        }
    }
}


