/**
 * Problem 5.	* Print a Character Triangle
 * Create a triangle of characters, based on input. Learn about java.util.Scanner and Integer.parseInt ().
 * Test your program with integers up to 26. Think why.
 */

import java.util.Scanner;

public class P5PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxWeigth = Integer.parseInt(scanner.next());

        int i = 'a';

        for (int count = 1; count < 2 * maxWeigth; count++) {
            if (count <= maxWeigth) {
                i++;
            } else {
                i--;
            }
            for (char j = 'a'; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
