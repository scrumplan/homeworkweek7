package homeworkweek7;
/*Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)
        */

import java.util.Scanner;

public class Program1TernaryOperator {

        //main method
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); //scanner syntax
        System.out.println("Enter a number : ");
        int num = obj.nextInt();

        String result = (num % 2 == 0) ? "even" : "odd"; //using ternary operator
        System.out.println((num + "  is  " + result + "number" ));

    }


}




