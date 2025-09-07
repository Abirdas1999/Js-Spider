import java.util.Scanner;

public class Prime {
        public static void main(String[] args) {
        System.out.println("Enter a number to check --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n) == true) {
            System.out.println("Your number is a Prime Number");
        } else {
            System.out.println("Your number is not a Prime Number");
        }

    }

    public static Boolean isPrime(int num) {
        Boolean flag = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag && num>=2;
    }
}
