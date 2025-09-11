
import java.util.Scanner;

public class PiramidHollow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();

        //#1 this a code--> piramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // printing the star
            for (int j = 1; j <= 2 * i - 1; j++) {
                // System.out.print("* ");

                if (j == 1 || i == n || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
