
import java.util.Scanner;

public class Prime2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check from --> ");
        int start = sc.nextInt();
        System.out.println("Enter a number to check from --> ");
        int end = sc.nextInt();
        Boolean flag;

        for (int i = start; i <= end; i++) {

            if (i <= 1) {
                continue;
            }
            flag = true;
            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    flag = false;
                    break;
                }

            }

            if (flag) {
                System.out.println(i);
            }

        }

    }
}
