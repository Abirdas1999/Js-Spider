
import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to Check --> ");
        int n = sc.nextInt();
        int temp = n;

        int sum = 0;
        int mul =1;
        
        while (n>0) {

            for (int r=n%10; r >= 1; r--) {
                mul*=r;
            }
            sum+=mul;
            n/=10;
            mul=1;
            
        }


        if (sum == temp) {
            System.out.println("Your number is a STRONG NUMBER ");
        } else {
            System.out.println("Your number is not a STRONG NUMBER ");
        }
        
    }
}
