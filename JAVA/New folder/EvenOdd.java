import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number -> ");
        int num = sc.nextInt();
        if (num>=0) {
            // even
            if (num%2==0) {

                System.out.println("Your number "+ num + ",is a 'Positive Even Number' and it's consecutive numbers are " + (num+2) +" "+(num+4)+" "+ (num+6));
            } else {
                System.out.println("Your number "+ num + ",is a 'Positive Odd Number' and it's consecutive numbers are " + (num+2) +" "+(num+4)+" "+ (num+6));
            }

        }else{
            // odd
            if (num%2==0) {
                System.out.println("Your number "+ num + ",is a 'Negative Even Number' and it's consecutive numbers are " + (num-2) +" "+(num-4)+" "+ (num-6));
            } else {
                System.out.println("Your number "+ num + ",is a 'Negative Odd Number' and it's consecutive numbers are " + (num-2) +" "+(num-4)+" "+ (num-6));
            }
        }
        

    }
}
