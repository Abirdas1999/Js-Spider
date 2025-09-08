
import java.util.Scanner;

public class Strong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;

        if (isStrong(n, sum, temp)) {

            System.out.println("Your number is Strong number ");
        } else {
            System.out.println("Your number is not Strong number ");

        }
    }

    static Boolean isStrong(int n, int sum, int temp) {
        int mul=1;

        if (n < 1) {
            return sum == temp;
        }
        sum+=isStrongHelper(n%10,mul);

        return isStrong(n / 10, sum, temp);
    }



    static int isStrongHelper(int n,int mul) {
        if (n<=1) {
            return mul;
        }
        mul *= n;
        return isStrongHelper(n - 1,mul);
    }
}
