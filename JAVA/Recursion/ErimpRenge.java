
import java.util.Scanner;

public class ErimpRenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  first number to get Erimp number--> ");
        int start = sc.nextInt();

        System.out.println("Enter last number to get Erimp number--> ");
        int end = sc.nextInt();
        ErimpRenges(start, end);

    }

    //final cheak for erimp in renge...
    static void ErimpRenges(int st, int ed) {

        if (st > ed) {
            return;
        }
        int rev = 0;

        if (st != Reverse(st, rev)) {
            if (isPrimeN(st, st / 2) && (isPrimeN(Reverse(st, rev), Reverse(st, rev) / 2))) {
                System.out.println(st + " ");
            }
        }

        ErimpRenges(st + 1, ed);
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
