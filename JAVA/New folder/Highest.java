import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 1st number -> ");
        int num1 = sc.nextInt();
        System.out.println("Enter any 2nd number -> ");
        int num2 = sc.nextInt();
        System.out.println("Enter any 3rd number -> ");
        int num3 = sc.nextInt();
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Please do not enter the same or equal number of value, Try again! ");
        } else {
            if (num1 > num2 && num1 > num3) {
                if (num2 > num3) {
                    System.out.println("2nd highest number is " + num2);
                } else {
                    System.out.println("2nd highest number is " + num3);
                }

            } else if (num2 >= num1 && num2 >= num3) {
                if (num1 > num3) {
                    System.out.println("2nd highest number is " + num1);
                } else {
                    System.out.println("2nd highest number is " + num3);
                }
            }

        }

    }
}
