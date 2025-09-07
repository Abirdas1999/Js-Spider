import java.util.Scanner;

public class PrimeSecHigh {
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
        if (PrimeAlter.isPrime(ed, ed / 2)) {
            count++;
            if (count == 2) {
                System.out.print(ed + " ");
            }
        }

        isPrimeRenge(st, ed-1, count);
    }

}
