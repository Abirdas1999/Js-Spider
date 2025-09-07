
import java.util.Scanner;

public class PrimeRenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number to get Prime number--> ");
        int start = sc.nextInt();

        System.out.println("Enter last number to get Prime number--> ");
        int end = sc.nextInt();
        isPrimeRenge(start, end);
    }

    static void isPrimeRenge(int st, int ed) {
        if (st > ed) {
            return;
        }
        if (isPrime(st, st / 2)) {
            System.out.print(st + " ");
            

        }
        isPrimeRenge(st + 1, ed);
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
