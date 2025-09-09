
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get the all number within renge --> ");
        int count = sc.nextInt();

        FiboRengs(0, 1, count);
    }

    static void FiboRengs(int st, int ed, int count) {
        if (count == 0) {
            return;
        }
        System.out.print(st + " ");
        FiboRengs(ed, (st + ed), count - 1);
    }
}
