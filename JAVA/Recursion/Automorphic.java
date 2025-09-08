
import java.util.Scanner;

public class Automorphic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();

        if (isAutomorphic(n, n * n)) {
            System.out.println("Your number is Emrip number ");
        } else {
            System.out.println("Your number is not Emrip number ");

        }
    }

    static Boolean isAutomorphic(int n, int sq) {
        if (n != 0) {
            return n % 10 == sq % 10;
        }

        return isAutomorphic(n / 10, sq / 10);
    }
}
