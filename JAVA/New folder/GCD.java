
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number --> ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number --> ");
        int n2 = sc.nextInt();
        int n = (n1 > n2) ? n1 : n2; //find the lowest number
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                mul *= i;
            }
        }
        System.out.println("Your GCD of the numbers is --> " + mul);
    }
}
