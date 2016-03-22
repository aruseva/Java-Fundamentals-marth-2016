/** Problem 6.	Convert from base-7 to decimal
 * Write a program that converts from a base-7 number to its decimal representation
 */
import java.util.Scanner;

public class P06_ConvertBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String intNumber = scan.next();
        System.out.println(Integer.toString(Integer.parseInt(intNumber, 7), 10));
    }
}
