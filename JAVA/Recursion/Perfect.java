import java.util.Scanner;

public class Perfect {

    public static void main(String[] args) {
        // isPerfect(6, 1, 0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();
        // System.out.println(isPerfect(n, 1, 0));
        if (isPerfect(n, 1, 0)) {
            System.out.println("Your number is Perfect ");
        } else {
            System.out.println("Your number is not Perfect ");
        
        }
    }

    static Boolean isPerfect(int n, int i, int sum) {
        if (i > n / 2) {
            return n == sum;
        }
        if (n % i == 0) {
            sum += i;
        }
        return isPerfect(n, i + 1, sum);
    }
}
