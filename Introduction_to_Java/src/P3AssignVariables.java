/**
 * Problem 3.	Assign Variables
 * Find suitable types for variables. You are given the following types: byte, short, int, long, char, boolean, float, double, and String.
 * Assign the following values to them false, “Palo Alto, CA”, 32767, 2000000000, 0.1234567891011, 0.5f, 919827112351L, 127, ‘c’.
 * Try to assign 32768 to short and see what happens.
 */

public class P3AssignVariables {
    public static void main(String[] args) {
        boolean bool = false;
        String str = "Palo Alto, CA";
        short sh = 32767;
        int i = 2_000_000_000;
        double d = 0.1_234_567_891_011;
        float fl = 0.5f;
        long l = 919827112351L;
        byte b = 127;
        char ch = 'c';

        System.out.println(b);
        System.out.println(ch);

    }
}
