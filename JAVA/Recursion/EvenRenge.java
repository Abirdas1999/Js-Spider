
import java.util.Scanner;

public class EvenRenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number --> ");
        int st = sc.nextInt();
        System.out.println("Enter ending number --> ");
        int ed = sc.nextInt();
        Even(st, ed);
    }

    static void Even(int st, int ed) {
        // int r;
        if (st > ed) {
            return;
        }
        if (st % 2 == 0) {

            System.out.print(st + " ");
        }

        Even(st+1,ed);

    }
}
