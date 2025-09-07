
import java.util.Scanner;

public class BinaryDec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number to convert --> ");
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;

        System.out.println(ToDec(num, sum, prod));

    }

    static int ToDec(int n, int sum, int prod) {
        if (n < 1) {
            return sum;
        }
        int c = prod * (n % 10);
        sum += c;

        return ToDec(n / 10, sum, prod * 2);
    }
}
