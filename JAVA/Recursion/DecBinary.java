
import java.util.Scanner;

public class DecBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert --> ");
        int num = sc.nextInt();
        ToBinary(num);

    }

    static void ToBinary(int n) {
        if (n <= 0) {
            return;
        }

        int c = n % 2;
        ToBinary((n / 2));
        System.out.print(c);
    }
}
