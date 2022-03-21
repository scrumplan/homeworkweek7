package homeworkweek7;
/* Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
If any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        String alphabet;

        System.out.print("Enter the alphabet from A to F: ");
        Scanner a = new Scanner(System.in);
        alphabet = a.nextLine();

        if (alphabet.equals("A")) {
            System.out.println("City name is Anand ");

        } else if (alphabet.equals("B")) {
            System.out.print("City name is Bombay ");

        } else if (alphabet.equals("C")) {
            System.out.println("City name is Canasad");

        } else if (alphabet.equals("D")) {
            System.out.println("City name is Dakor ");

        } else if (alphabet.equals("E")) {
            System.out.println("City name is East London ");

        } else if (alphabet.equals("F")) {
            System.out.println("City name is Fatepur ");

        } else {
            System.out.println("Error Operator");

        }
    }
}
