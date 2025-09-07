
import java.util.Scanner;



public class Palindrome {

public static void main(String[] args) {
    System.out.println ("Enter a number to cheak--> ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int rev = 0;
    while (n > 0) {
        int i = n % 10;
        n = n / 10;
        rev = (rev * 10) + i;
    }


    System.out.println(rev);
    if (temp==rev) {
        System.out.println("Number is Palindrome");
    } else {
        System.out.println("Number is not Palindrome");
    }


}
}
