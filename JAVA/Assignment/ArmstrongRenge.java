import java.util.Scanner;

public class ArmstrongRenge {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, checking start from --> ");
        int st = sc.nextInt();
        System.out.println("Enter a number, checking end with --> ");
        int ed = sc.nextInt();
        System.out.println("All Armstrong numbers are --> ");
        Range(st, ed);
    }

    public static void Range(int start, int end) {
        Boolean flag = false;
        for (int i = start; i <= end; i++) {
            if (Armstrong.isArmstrong(i)) {
                System.out.print(i + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No number is found ");
        }
    }
}
