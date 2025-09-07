
import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number --> ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number --> ");
        int n2 = sc.nextInt();
        // Boolean flag;
        int n = (n1 > n2) ? n1 : n2; //find the highest number
        int i = n;
        while (true) {
            if (n % n1 == 0 && n % n2 == 0) {
                break;
            }
            n+=i;
        }
        System.out.println("Your LCM of the numbers is --> "+n);
    }
}
