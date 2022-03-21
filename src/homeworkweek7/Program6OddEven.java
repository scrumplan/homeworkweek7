package homeworkweek7;
 /*Write a java program to input any number and find out if it’s odd or even*/

import java.util.Scanner;

public class Program6OddEven {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = A.nextInt();

        //If number is divisible by 2 then it's an even number
        //else odd number
        if (num % 2 == 0) {
            System.out.println("The entered number is even");

        } else {
            System.out.println("The entered number is odd");
        }
    }
}


