package homeworkweek7;
/*Write a program that tells us input value is number or an alphabet or symbol.*/

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        char ch;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any char : ");
        ch = obj.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet is " + ch);

        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Number is " + ch);

        } else {
            System.out.println("symbol is " + ch);

        }
    }

}
