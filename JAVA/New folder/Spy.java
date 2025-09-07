
import java.util.Scanner;

public class Spy {

    public static void main(String[] args) {
        System.out.println("Enter a number to check--> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int prod = 1;
        int sum = 0;
        while (num > 0) {
            int r = num%10;
            sum += r;
            prod*=r;
            num /= 10;
        }
        if (sum == prod) {
            System.out.println("Your number is Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
    }
}
