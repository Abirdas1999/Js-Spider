
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Enter a number to cheack --> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
    

        // length of the number
        int i = 0;
        while (num > 0) {
            i++;
            num /= 10;
        }

        num = temp;  //re-asgin the value of real number;

        while (num > 0) {
            int pow = 1;
            for (int j = 1; j <= i; j++) {
                pow = pow * (num % 10);
            }
            sum += pow;
            num /= 10;
        }
        if (sum==temp) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number not a Armstrong");
        }
        // System.out.println(sum);
    }
}
