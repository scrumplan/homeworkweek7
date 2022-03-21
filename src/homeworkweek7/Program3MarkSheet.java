package homeworkweek7;

import java.util.Scanner;

public class Program3MarkSheet {
    public static void main(String[] args) {
        String name;
        int roll;
        int math;
        int science;
        int english;
        String result = null;
        String grade = null;
        System.out.println("Enter Student name");
        Scanner a = new Scanner(System.in);
        name = a.nextLine();
        System.out.println("Enter roll number");
        Scanner b = new Scanner(System.in);
        roll = b.nextInt();
        System.out.println("Enter marks for math, science and english");
        Scanner c = new Scanner(System.in);
        math = c.nextInt();
        science = c.nextInt();
        english = c.nextInt();
        int total = math + science + english;
        float percentage = ((total * 100) / 300);

        if (percentage >= 35) {
            result = "pass";

        } else {
            result = "fail";

        }
        if (percentage >= 80) {
            grade = "A+";
            System.out.println("Grade :" + grade);
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
            System.out.println("Grade : " + grade);

        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
            System.out.println("Grade : " + grade);

        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
            System.out.println("Grade : " + grade);
        } else {
            grade = "No grade";
        }


        System.out.println("  _______________________________ ");
        System.out.println(" |           Mark Sheet           |");
        System.out.println(" |________________________________|");
        System.out.println(" |   Name         :    " + name + "     |"); // sonali
        System.out.println(" |   Roll No:     " + roll + "              |"); //34
        System.out.println(" |_______________________________ |");
        System.out.println(" |   Subjects     :         Marks |");
        System.out.println(" |_______________________________ |");
        System.out.println(" |   Math         :      " + math + "       |"); // 78
        System.out.println(" |   Science:   " + science + "                |"); //67
        System.out.println(" |   English:   " + english + "                |"); // 89
        System.out.println(" |________________________________|");
        System.out.println(" |   Total        :      " + total + "      |");
        System.out.println(" |________________________________|");
        System.out.println(" |   Percentage    :   " + percentage + "       |");
        System.out.println(" |   Result        :     " + result + "     |");
        System.out.println(" |   Grade         :      " + grade + "       |"); //A
        System.out.println(" |________________________________|");
    }
}
