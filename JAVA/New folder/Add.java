import java.util.Scanner;

public class Add {

    public static void main(String[] args) {
        System.out.println("Enter a number of range starting for add -->");

        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();

        System.out.println("Enter a number of range Ending for add -->");
        int ed = sc.nextInt();

        int sum = 0;

        int i = st;
        while (i <=ed) {
            sum += i;
            i++;
        }
        // int sum = (n*(n+1)/2); this is the shortcut method to apply.

        System.out.println("The total adding value is ==> " +sum);
    }
}
