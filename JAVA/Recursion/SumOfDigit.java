
import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to sum the digits--> ");
        int sum = sc.nextInt();
        System.out.println(Sum(sum));
    }

    static int Sum(int n) {
        int r;
        if (n <= 9) {
            return n;
        }
        r = Sum(n / 10) + Sum(n % 10);

        if (r > 9) {
            return Sum(r);
        }
        return r; //sum till get the single value
    }
}
