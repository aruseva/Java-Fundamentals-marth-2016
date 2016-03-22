/**
 * Problem 2.	Triangle Area
 * Write a program that enters 3 points in the plane (as integer x and y coordinates), calculates and prints the area of the triangle composed by these 3 points.
 * Round the result to a whole number. In case the three points do not form a triangle, print "0" as result.
 */

import java.util.Scanner;

public class P02_TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intAx = scan.nextInt();
        int intAy = scan.nextInt();
        int intBx = scan.nextInt();
        int intBy = scan.nextInt();
        int intCx = scan.nextInt();
        int intCy = scan.nextInt();
        long lngArea;
        if ((intAx == intBx && intAx == intCx) || (intAy == intBy && intAy == intCy)) {
            lngArea = 0;
        } else {
            lngArea = Math.abs((intAx * (intBy - intCy) + intBx * (intCy - intAy) + intCx * (intAy - intBy)) / 2);
        }
        System.out.println(lngArea);
    }
}
