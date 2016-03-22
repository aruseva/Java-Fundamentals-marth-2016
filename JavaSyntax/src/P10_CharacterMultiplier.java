/**
 * Problem 10.	 Character Multiplier
 * Create a method that takes two strings as arguments and returns the sum of their character codes multiplied (multiply str1.charAt (0) with str2.charAt (0) and add to the total sum).
 * Then continue with the next two characters. If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.
 */

import java.util.Scanner;

public class P10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(CharMultiplier(str1, str2));
    }

    public static int CharMultiplier(String str1, String str2) {
        int dblSum = 0;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                dblSum = dblSum + str1.charAt(i) * str2.charAt(i);
            }
        } else {
            if (str1.length() < str2.length()) {
                String strTemp = str2;
                str2 = str1;
                str1 = strTemp;
            }
            for (int i = 0; i < str1.length(); i++) {
                if (i < str2.length()) {
                    dblSum = dblSum + str1.charAt(i) * str2.charAt(i);
                } else {
                    dblSum = dblSum + str1.charAt(i);
                }
            }
        }
        return dblSum;
    }
}
