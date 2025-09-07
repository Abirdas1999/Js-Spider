
import java.util.Scanner;

public class FiboRenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number to get Fibonacci number--> ");
        int start = sc.nextInt();

        System.out.println("Enter last number to get Fibonacci number--> ");
        int end = sc.nextInt();
        FibRenge(start, end);
    }

    static void FibRenge(int st, int ed) {

        System.out.println(st);
        if (st <= ed) {
            return;
        }
        FibRenge(st, st + 1);
    }
}
