
import java.util.Scanner;

public class ScLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number checking from --> ");
        int start = sc.nextInt();
        System.out.println("Enter a number checking Till --> ");
        int end = sc.nextInt();
        int num;
        Boolean flag;
        int count = 0;

        // all number within this renge
        for (num = end; num >= start; num--) {
            flag = true;

            // check for prime
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }

            // print 2nd Largest
            if (flag && num >= 2) {
                count++;
                if (count == 2){
                    System.out.println(num);
                }

            }

        }
    }
}
