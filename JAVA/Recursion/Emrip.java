
import java.util.Scanner;

public class Emrip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();

        if (isEmrip(n)) {
            System.out.println("Your number is Emrip number ");
        } else {
            System.out.println("Your number is not Emrip number ");

        }
    }

    //final cheak for erimp...
    static Boolean isEmrip(int n) {

        int rev = 0;

        if (n == Reverse(n, rev)) {
            return false;
        }

        return (isPrimeN(n, n / 2) && (isPrimeN(Reverse(n, rev), Reverse(n, rev) / 2)));

    }

    //cheak the number is prime or not...
    static Boolean isPrimeN(int n, int i) {

        if (i == 1) {
            return true;
        }
        if (n <= 1 || n % i == 0) {
            return false;
        }
        return isPrimeN(n, i - 1);

    }

    //reverse the main number...
    static int Reverse(int n, int rev) {

        if (n < 1) {
            return rev;
        }

        return Reverse((n / 10), ((rev * 10) + n % 10));
    }
}
