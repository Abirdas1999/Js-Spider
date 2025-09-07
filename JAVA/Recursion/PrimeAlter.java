
import java.util.Scanner;

public class PrimeAlter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number to get Prime number--> ");
        int start = sc.nextInt();

        System.out.println("Enter last number to get Prime number--> ");
        int end = sc.nextInt();
        int count = 0;
        isPrimeRenge(start, end, count);
    }

    static void isPrimeRenge(int st, int ed, int count) {
        if (st > ed) {
            return;
        }
        if (isPrime(st, st / 2)) {
            count++;
            if (count % 2 == 0) {
                System.out.print(st + " ");
            }
        }

        isPrimeRenge(st + 1, ed, count);
    }

    static Boolean isPrime(int n, int i) {

        if (i == 1) {
            return true;
        }
        if (n <= 1 || n % i == 0) {
            return false;
        }

        return isPrime(n, i - 1);
    }
}
