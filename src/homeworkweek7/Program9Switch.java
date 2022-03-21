package homeworkweek7;

import java.util.Scanner;

public class Program9Switch {
    public static void main(String[] args) {
        char city;
        System.out.println("Enter Your City Choice : "); // enter A to F Alphabet for result
        Scanner c = new Scanner(System.in);
        city = c.next().charAt(0);

        switch (city) {
            case 'A':
                System.out.println("city name is Agra  ");
                break;
            case 'B':
                System.out.println("city name is Bhalada");
                break;
            case 'C':
                System.out.println("city name is Canasad ");
                break;
            case 'D':
                System.out.println("city name is Dakor");
                break;
            case 'E':
                System.out.println("city name is Ellenabad");
                break;
            case 'F':
                System.out.println("city name is Faizabad");
                break;
            default:
                System.out.println(" Invalid Entry");

        }
    }
}