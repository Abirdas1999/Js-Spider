
import java.util.Scanner;

public class Emrip {

    public static void main(String[] args) {
        System.out.println("Enter a number to check --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isEmrip(n) == true) {
            System.out.println("Your number is a Emrip Number");
        } else {
            System.out.println("Your number is not a Emrip Number");
        }

    }

    public static Boolean isEmrip(int num) {
        int rev = 0;
        Boolean flag = true;
        int temp = num;

        //check the prime for the original number
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }

        }
        //reverce the number 
        while (num > 0) {
            int r = num % 10;
            rev = (rev * 10) + r;
            num /= 10;
        }

        num = temp; //re-assign the value

        //check the prime for the reverce number
        for (int i = 2; i <= rev / 2; i++) {
            if (rev % i == 0) {
                flag = false;
                break;
            }

        }

        return flag && num >= 2 && rev >= 2 && num != rev;
    }
}
