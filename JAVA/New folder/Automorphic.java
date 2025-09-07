
import java.util.Scanner;

public class Automorphic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to cheak --> ");
        int num = sc.nextInt();

        int sqt = num * num;
        Boolean flag = true;

        while (num > 0) {
            if (num % 10 != sqt % 10) {
                flag = false;
                break;
            }
            num /= 10;
            sqt /= 10;

            
        }
        if (flag) {
            System.out.println("Your number is Automorphic ");
        } else {
            System.out.println("Your number is not Automorphic ");

        }


    }
}
