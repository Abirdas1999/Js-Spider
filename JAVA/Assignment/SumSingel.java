
import java.util.Scanner;

public class SumSingel {

    public static void main(String[] args) {
        System.out.println("Enter a number to check --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isSumSingel(n));

    }

    public static int isSumSingel(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
            if (sum > 9) {
                num = sum;
                sum = 0;
            }
        }

        return sum;
    }
}
