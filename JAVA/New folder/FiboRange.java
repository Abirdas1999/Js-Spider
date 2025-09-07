
import java.util.Scanner;

public class FiboRange {

    public static void main(String[] args) {
        System.out.println("Enter last number to see all previous fibonacci numbers --> ");
        Scanner sc = new Scanner(System.in);
        int ren = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        while (true) {
            int c = a + b;
            if (c <= ren) {
                System.out.print(c + " ");
                a = b;
                b = c;
                // break;
            }

        }

    }
}
