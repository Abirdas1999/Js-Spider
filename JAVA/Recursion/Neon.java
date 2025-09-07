
import java.util.Scanner;

public class Neon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();
        int sum =0;
        int sq = n*n;
        if (isNeon(n,sum,sq)) {
            System.out.println("Your number is Neon number ");
        } else {
            System.out.println("Your number is not Neon number ");

        }
    }

    static Boolean isNeon(int n,int sum,int sq) {
        if (sq == 0) {
            return sum == n;
        }
        sum += sq % 10;
        return isNeon(n,sum,sq/10);
    }
}
