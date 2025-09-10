
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check--> ");
        int n = sc.nextInt();

        int len = (n + "").length();
        int temp = n;

        if (isArmstrong(n, len, 0, temp)) {
            System.out.println("The number is a Armstrong Number");
        } else {
            System.out.println("The number is not a Armstrong Number");
        }
    }

    static Boolean isArmstrong(int n, int len, int sum, int temp) {
        if (n < 1) {
            return sum == temp;
        }
        sum += (int) (Math.pow(n % 10, len));

        return isArmstrong(n / 10, len, sum, temp);
    }
}
