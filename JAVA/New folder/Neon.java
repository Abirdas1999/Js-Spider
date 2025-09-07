
import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        System.out.println("Enter a number to check--> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        int sq = num*num;
        int sum = 0;
        while (sq>0) {
            sum+=sq%10;
            sq/=10;
        }
        if (sum==num) {
            System.out.println("Your number is Neon Number");
        }else{
            System.out.println("Not a neon Number");
        }
    }
}
