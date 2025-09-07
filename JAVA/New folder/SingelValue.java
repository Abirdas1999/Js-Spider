import java.util.Scanner;

public class SingelValue {
    public static void main(String[] args) {
        System.out.println("Enter a number --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while (n>0) {
            sum += n%10;
            n/=10;
            if (n==0 && sum>9) {
                System.out.println(sum);
                n=sum;
                sum=0;
            }
        }



        // while (n > 9) {
        //     while (n > 0) {
        //         sum += n % 10;
        //         n /= 10;
        //         System.out.println(sum);
        //         n = sum;
        //         sum = 0;
        //     }
        // }

        // System.out.println(num +" + " + " = " + sum);
    }
}
