import java.util.Scanner;

public class Amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your bank balance --> ");
        int amount = sc.nextInt();
        int count = 0;
        if (amount >= 2000) {
            count = amount / 2000;
            System.out.println("2000's --> " + count);
            amount = amount % 2000;

        }
        if (amount >= 500) {
            count = amount / 500;
            System.out.println("500's --> " + count);
            amount = amount % 500;
        }
        if (amount >= 200) {
            count = amount / 200;
            System.out.println("200's --> " + count);
            amount = amount % 200;
        }
        if (amount >= 100) {
            count = amount / 100;
            System.out.println("100's --> " + count);
            amount = amount % 100;
        }
        if (amount >= 50) {
            count = amount / 50;
            System.out.println("50's --> " + count);
            amount = amount % 50;
        }
        if (amount >= 20) {
            count = amount / 20;
            System.out.println("20's --> " + count);
            amount = amount % 20;
        }
        if (amount >= 10) {
            count = amount / 10;
            System.out.println("10's --> " + count);
            amount = amount % 10;
        }
        if (amount >= 5) {
            count = amount / 5;
            System.out.println("5's --> " + count);
            amount = amount % 5;
        }
        if (amount >= 2) {
            count = amount / 2;
            System.out.println("2's --> " + count);
            amount = amount % 2;
        }
        if (amount >= 1) {
            count = amount / 1;
            System.out.println("1's --> " + count);
            amount = amount % 1;
        }
    }
}
