
import java.util.Scanner;

public class ArmstrongNew {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number checking from --> ");
        int start = sc.nextInt();
        System.out.println("Enter a number checking Till --> ");
        int end = sc.nextInt();
        int num;
        Boolean flag = false;
        // all number within this renge
        for (int i = start; i <= end; i++) {

            // flag=false;
            int sum = 0;
            num = i;
            int len = (num + "").length();

            while (num > 0) {
                sum += Math.pow(num % 10, len);
                num /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
                flag = true;
            }

        }

        if (!flag) {
            System.out.println("There is no number found! ");

        }


    }
}
