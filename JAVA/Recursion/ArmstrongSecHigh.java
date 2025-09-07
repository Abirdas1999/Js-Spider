import java.util.Scanner;

public class ArmstrongSecHigh {
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
        int len = (ed + "").length();
        int temp = ed;
        int sum = 0;

        if (ArmstrongRenges.isArmstrong(ed, sum, len, temp)) {
            count++;
            if (count == 2) {

                System.out.print(ed + " ");
            }

        }
        ArmstrongRenge(st, ed-1, count);
    }
}
