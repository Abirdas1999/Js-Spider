
import java.util.Scanner;

public class PalindromePrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number --> ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        if (isPalindrome(num, sum, temp)) {
            System.out.println("Your number is Prime-Palindrome number ");
        } else {
            System.out.println("Your number is not Prime-Palindrome number ");

        }
    }

    static Boolean isPalindrome(int n, int sum, int temp) {
        
        if (n != 0) {
            sum = (sum * 10) + n % 10;
            return isPalindrome(n / 10, sum, temp);
        }

        return sum == temp && isPrimeN(temp, temp / 2);
    }

    //cheak the number is prime or not...
    static Boolean isPrimeN(int n, int i) {

        if (i == 1) {
            return true;
        }
        if (n <= 1 || n % i == 0) {
            return false;
        }
        return isPrimeN(n, i - 1);

    }

}
