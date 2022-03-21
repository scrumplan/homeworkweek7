package homeworkweek7;

/* Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */
public class Program11 {
    public static void main(String[] args) {
        System.out.println("Divided by 3 : ");
        for (int a = 1; a < 100; a++) {
            if (a % 3 == 0)
                System.out.println(a + ", ");

        }
        System.out.println("Divided by 5 : ");
        for (int a = 1; a < 100; a++) {
            if (a % 5 == 0)
                System.out.println(a + ",");

        }

    }
}
