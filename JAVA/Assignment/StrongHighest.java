
import java.util.Scanner;

public class StrongHighest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, checking start from --> ");
        int st = sc.nextInt();
        System.out.println("Enter a number, checking end with --> ");
        int ed = sc.nextInt();

        System.out.println("Biggest Strong number is --> ");
        Range(st, ed);
    }

    public static void Range(int start, int end) {
        Boolean flag = false;
        int count = 0;
        for (int i = end; i >= start; i--) {
            if (Strong.isStrong(i)) {
                count++;
                flag = true;
                if (count == 1) {
                    System.out.print(i);
                    break;
                }
            }
            
        }
        if (!flag) {
            System.out.println("No number is found ");
        }
    }
}
