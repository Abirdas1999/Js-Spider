import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number to check --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPalindrome(n) == true) {
            System.out.println("Your number is a Palindrome Number");
        } else {
            System.out.println("Your number is not a Palindrome Number");
        }

    }

    public static Boolean isPalindrome(int num) {
        int sum = 0;
        int temp = num;

        while(num>0){
           int r=num%10;
           sum = (sum*10)+r;
           num/=10;
        }

        return sum == temp;
    }
}
