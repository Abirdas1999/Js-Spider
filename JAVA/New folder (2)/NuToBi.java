
import java.util.Scanner;

public class NuToBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number --> ");
        int num = sc.nextInt();

        int dec = 0;
        int i =1 ;
        while (num>0) {
            int r = num%10;
            dec += r*i;
            i*=10;
            num/=2;
        }
        System.out.println("Your Decmal value is --> "+dec);
    }
}
