
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number --> ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        if (isPalindrome(num, sum, temp)) {
            System.out.println("Your number is Palindrome number ");
        } else {
            System.out.println("Your number is not Palindrome number ");

        }
    }

    static Boolean isPalindrome(int n, int sum, int temp) {

        if (n < 1) {
            return sum == temp;
        }
        sum = (sum * 10) + n % 10;
        return isPalindrome(n/10, sum, temp);
    }
}
