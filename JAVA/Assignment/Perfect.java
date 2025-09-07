
import java.util.Scanner;

public class Perfect {

    public static void main(String[] args) {
        System.out.println("Enter a number to check --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPerfect(n) == true) {
            System.out.println("Your number is a Perfect Number");
        } else {
            System.out.println("Your number is not a Perfect Number");
        }

    }

    public static Boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
