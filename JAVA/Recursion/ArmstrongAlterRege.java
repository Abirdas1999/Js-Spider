
import java.util.Scanner;

public class ArmstrongAlterRege {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number to get Armstrong number--> ");
        int start = sc.nextInt();

        System.out.println("Enter last number to get Armstrong number--> ");
        int end = sc.nextInt();
        int count = 0;
        ArmstrongRenge(start, end, count);
    }

    static void ArmstrongRenge(int st, int ed, int count) {

        if (st > ed) {
            return;
        }
        int len = (st + "").length();
        int temp = st;
        int sum = 0;

        if (ArmstrongRenges.isArmstrong(st, sum, len, temp)) {
            count++;
            if (count % 2 == 0) {

                System.out.print(st + " ");
            }

        }
        ArmstrongRenge(st + 1, ed, count);
    }

}
