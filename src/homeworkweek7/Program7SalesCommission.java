package homeworkweek7;

/* Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
*/

import java.util.Scanner;

public class Program7SalesCommission {
    public static void main(String[] args) {
        int salesID;
        String SellerName;
        int amount;
        double salaryBasic;
        double saleCommission;
        System.out.println("Enter sales id"); // ID is 33
        Scanner x = new Scanner(System.in);
        salesID = x.nextInt();
        System.out.println("Enter seller name "); //Jay
        Scanner y = new Scanner(System.in);
        SellerName = y.nextLine();
        System.out.println("Enter sales amount :"); //2000
        Scanner z = new Scanner(System.in);
        amount = z.nextInt();
        System.out.println("Enter basic salary");//70000
        Scanner zz = new Scanner(System.in);
        salaryBasic = zz.nextDouble();

        if (amount >= 50000) {
            System.out.println("sales commission is =" + (amount * 0.35));

        } else if (amount >= 30000) {
            System.out.println("Sales commission is = " + (amount * 0.20));
        } else if (amount >= 20000) {
            System.out.println("Sales commission is = " + (amount * 0.10));
        } else if (amount < 10000) {
            System.out.println("Sales Commission is = " + (amount * 0.02));
        } else {
            System.out.println("Please input valid value");
        }

    }
}
