package homeworkweek7;
/* Write a Java program to calculate the average value of array elements.*/

public class Program19 {
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 45, -68, 39, -21};
        //calculate sum of all array elements
        int average;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        //calculate average value
        average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
