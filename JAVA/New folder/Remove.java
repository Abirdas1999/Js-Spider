import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        System.out.println("Enter a number --> ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i=0;
        while (n>0) {
            i=n%10;
            System.err.println(i);
            n/=10;
            
            
        }

    }
}
