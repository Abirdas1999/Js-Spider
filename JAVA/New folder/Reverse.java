
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        System.out.println("Enter a number to Reverce--> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            int i = n % 10;
            n = n / 10;
            rev = (rev * 10) + i;
        }

        System.out.println("Your reverse number is " + rev);

    }
}
