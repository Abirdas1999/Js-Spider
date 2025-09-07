import java.util.Scanner;

public class PrimeAlter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, checking start from --> ");
        int st = sc.nextInt();
        System.out.println("Enter a number, checking end with --> ");
        int ed = sc.nextInt();

        System.out.println("All alternative Prime numbers are --> ");
        Range(st, ed);
    }

    public static void Range(int start, int end) {
        Boolean flag = false;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (Prime.isPrime(i)) {
                count++;
                flag = true;
                if (count % 2 != 0) {
                    System.out.print(i + " ");
                }
            }

        }
        if (!flag) {
            System.out.println("No number is found ");
        }
    }
}
