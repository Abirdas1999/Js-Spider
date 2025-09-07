import java.util.Scanner;

public class SingelSum {
    public static void main(String[] args) {
        System.out.println("Enter a number --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n>0) {
            sum+=n%10;
            n=n/10;
            while (n==0 && sum>9) {
                n=sum;
                sum=0;
            }

        }
        System.out.println(sum);
    }
}
