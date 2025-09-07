import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.println("Enter a number for adding till that number from 1 -->");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <=n) {
            sum += i;
            i++;
        }
        // int sum = (n*(n+1)/2); this is the shortcut method to apply.

        System.out.println("The total adding value is ==> " +sum);
    }
}
