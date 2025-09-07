
import java.util.Scanner;

public class ArmstrongRenges {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number to get Armstrong number--> ");
        int start = sc.nextInt();

        System.out.println("Enter last number to get Armstrong number--> ");
        int end = sc.nextInt();
        ArmstrongRenge(start, end);
    }

    static void ArmstrongRenge(int st, int ed) {

        if (st > ed) {
            return;
        }
        int len = (st + "").length();
        int temp = st;
        int sum = 0;

        if (isArmstrong(st, sum, len, temp)) {
            System.out.print(st + " ");

        }
        ArmstrongRenge(st + 1, ed);
    }

    static Boolean isArmstrong(int n, int sum, int len, int temp) {
        if (n == 0) {
            return sum == temp;
        }
        sum += Math.pow(n % 10, len);
        return isArmstrong(n / 10, sum, len, temp);
    }

}
