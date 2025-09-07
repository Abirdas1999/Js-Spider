
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        System.out.println("Enter a number to cheak--> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean flag = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }

        }
        if (flag && n >= 2) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }

        // for (int i = 2; i<=n/2; i++) {
        //     if (n%i==0){
        //         System.out.println("Not a prime number ");
        //         break;
        //     }
        // }System.out.println("Prime number");
    }
}
