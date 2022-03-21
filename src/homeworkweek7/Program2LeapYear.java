package homeworkweek7;
// Write a java program to input any year like (ex.2007) and find out if it is leap year or not.

import java.util.Scanner;

public class Program2LeapYear {

    public static void main(String[] args) {
        int year = 2007;// take any leap year

        System.out.print("Enter the year : ");

        Scanner input = new Scanner(System.in);
        year = input.nextInt();


        if (year % 4 == 0 && year % 100  != 0 || year % 400 == 0 ) { // only enter  Leap Years up to 2400 year
            System.out.println(year + ": Leap Year");
        } else {
            System.out.println(year + "   not a leap year!");
        }

    }
}

