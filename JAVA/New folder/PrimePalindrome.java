
import java.util.Scanner;

public class PrimePalindrome {

    public static void main(String[] args) {
        System.out.println("Enter a number to check--> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        Boolean flag = true;
        // reverse number
        int rev = 0;
        while (n > 0) {
            int i = n % 10;
            n = n / 10;
            rev = (rev * 10) + i;
        }
        n = temp; //coping again temp to original

        // check for Palindrome
        if (rev == n) {

            // check prime logic for n
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }

            // check prime logic for rev
            // for (int i = 2; i <= rev / 2; i++) {
            //     if (rev % i == 0) {
            //         flag = false;
            //         break;
            //     }
            // }

            // final check and print
            if (flag && n >= 2 && rev >= 2) {
                System.out.println("Number is Prime Palindrome Number");
            } else {
                System.out.println("Number is not Prime Palindrome Number");
            }

        } else {
            System.out.println("Number is not a Prime Palindrome");
        }

    }
}
