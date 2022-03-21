package homeworkweek7;
/* Write a Java program to sum values of an array.*/

public class Program18 {
    public static void main(String[] args) {
        int [] array = {1,45,26,67,56,5};
        int sum = 0;
        for (int i : array)
            sum += i;
        System.out.println("The sum is " + sum );
    }
}
