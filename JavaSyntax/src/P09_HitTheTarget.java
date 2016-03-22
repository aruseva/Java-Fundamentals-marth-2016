/** Problem 9.	*Hit the Target
 * Write a program that takes as input an integer – the target – and outputs to the console all pairs of numbers between 1 and 20,
 * which, if added or subtracted, result in the target.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P09_HitTheTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbN = scan.nextInt();
        List<String> listSum = new ArrayList<>();
        List<String> listSub = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == numbN) {
                    String strTmp = String.valueOf(i) + " + " + String.valueOf(j) + " = " + String.valueOf(i + j);
                    listSum.add(String.valueOf(strTmp));
                    listSum.add("\n");
                }
                if (i - j == numbN) {
                    String strTmp = String.valueOf(i) + " - " + String.valueOf(j) + " = " + String.valueOf(i - j);
                    listSub.add(String.valueOf(strTmp));
                    listSub.add("\n");
                }
            }
        }
        for (String item : listSum) {
            System.out.print(item);
        }
        for (String item : listSub) {
            System.out.print(item);
        }
    }
}
