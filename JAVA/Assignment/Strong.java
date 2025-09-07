
import java.util.Scanner;

public class Strong {

    public static void main(String[] args) {
        System.out.println("Enter a number to check --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isStrong(n)==true){
            System.out.println("Your number is a Strong Number");
        }else{
            System.out.println("Your number is not a Strong Number");
        }

    }

    public static Boolean isStrong(int num) {
        int temp = num;
        int sum = 0;
        int mul = 1;

        while (num > 0) {
            for (int i = num % 10; i >= 1; i--) {
                mul *= i;
            }
            sum += mul;
            num/=10;
            mul=1;
        }

        return sum == temp;
    }
}
