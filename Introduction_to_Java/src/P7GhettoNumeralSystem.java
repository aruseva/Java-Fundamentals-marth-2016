/**
 * Problem 7.	*Ghetto Numeral System
 * Write a program that converts the decimal number system to the ghetto numeral system.
 * In the ghetto, numbers are represented as following:
 * 0 – Gee; 1 – Bro; 2 – Zuz; 3 – Ma; 4 – Duh
 * 5  - Yo; 6 – Dis; 7 – Hood; 8 – Jam; 9 – Mack
 */

import javax.lang.model.element.NestingKind;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Stream;

public class P7GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //   int intNumber = Integer.parseInt(scanner.next());


        String strNumber = scanner.nextLine();
        ArrayList<String> ghettoNumber = new ArrayList<>();

        String strOutput = "";
        for (int i = 0; i < strNumber.length(); i++) {
            String strDigit = String.valueOf(strNumber.charAt(i));
            strOutput = strOutput + ConvertDigits(strDigit);
        }
        System.out.println(strOutput);

    }

    public static String ConvertDigits(String strDigit) {
        String strConvert = "";
        switch (strDigit) {
            case "0":
                strConvert = "Gee";
                break;
            case "1":
                strConvert = "Bro";
                break;
            case "2":
                strConvert = "Zuz";
                break;
            case "3":
                strConvert = "Ma";
                break;
            case "4":
                strConvert = "Duh";
                break;
            case "5":
                strConvert = "Yo";
                break;
            case "6":
                strConvert = "Dis";
                break;
            case "7":
                strConvert = "Hood";
                break;
            case "8":
                strConvert = "Jam";
                break;
            case "9":
                strConvert = "Mack";
                break;
        }
        return strConvert;
    }
}
