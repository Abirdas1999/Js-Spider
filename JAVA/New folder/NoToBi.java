
import java.util.Scanner;

public class NoToBi {

    public static void main(String[] args) {
        // #Dec To Binary
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number --> ");
        int num = sc.nextInt();
        int dec = 0;
        int i =1 ;
        while (num>0) {
            int r = num%2;
            dec += r*i;
            i*=10;
            num/=2;
        }
        System.out.println("Your Binary value is --> "+dec);


        // # Binary to Dec

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Binary Number --> ");
        // int num = sc.nextInt();
        // int bin = 0;
        // int pow = 1;
        // while (num > 0) {
        //     int r = num%10;
        //     bin+=r*pow;
        //     pow*=2;
        //     num /= 10;

        // }
        // System.out.println("Your Decimel value is --> " + bin);
    }
}
