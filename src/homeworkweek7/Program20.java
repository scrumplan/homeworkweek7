package homeworkweek7;
/* Write a Java program to test if an array contains a specific value*/

public class Program20 {
    public static boolean contains(int[] a, int b) {
        for (int n : a) {
            if (b == n) {
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {100, 200, 300, 400, 500, 600, 700, 800, 900,};
        System.out.println(contains(array, 300)); // true
        System.out.println(contains(array, 1000)); //false

    }
}
