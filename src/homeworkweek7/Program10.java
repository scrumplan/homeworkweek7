package homeworkweek7;
/* Write a java program to input any two number and ask user to enter their symbol
(+, -, /, *) find addition, Subtraction, multiplication and division according to
their symbol (using if else)
 */

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = " ";

        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.print("Enter number: ");
        int num1 = in.nextInt();
        System.out.println("Choose Operator [1]-Addition[2]-Subtraction [3]- Multiplication [4]- Division : ");
        int ch = in.nextInt();
        if (ch == 1) {
            System.out.println("Answer: ");
            System.out.println(num + num1);
        } else if (ch == 2) {
            System.out.println("Answer: ");
            System.out.println(num - num1);
        } else if (ch == 3) {
            System.out.print("Answer: ");
            System.out.println(num * num1);

        } else if (ch == 4) {
            System.out.println("Answer: ");
            System.out.println(num / num1);
        } else {
            System.out.println("Error Operator");
        }
    }
}
