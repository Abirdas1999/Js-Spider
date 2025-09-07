
import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        System.out.println("Enter a number to get the sum of the diviser --> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        for (int i = 1; i <= num / 2; i++) {
            if (num%i==0) {
                sum+=i;
            }
            System.out.println(i);
        }
        System.out.println("= "+sum);
        if (num==sum) {
            System.out.println("Your number is PERFECT NUMBER");
        } else {
            System.out.println("Your number is not a PERFECT NUMBER");
        }

    }
}
