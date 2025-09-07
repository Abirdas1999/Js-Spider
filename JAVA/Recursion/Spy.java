
import java.util.Scanner;

public class Spy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();
        if (isSpy(n, 1, 0)) {
            System.out.println("Your number is Spy number ");
        } else {
            System.out.println("Your number is not Spy number ");
        
        }
    }

    static Boolean isSpy(int n, int prod, int sum) {
        if (n < 1) {
            return sum == prod;
        }
        sum += n % 10;
        prod *= n % 10;
        return isSpy(n / 10, prod, sum);
    }
}
