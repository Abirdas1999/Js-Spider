
import java.util.Scanner;

public class AutomorphicSecHigh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number to get Automorphic number--> ");
        int start = sc.nextInt();

        System.out.println("Enter last number to get Automorphic number--> ");
        int end = sc.nextInt();
        int count = 0;
        AutomorphicRenges(start, end, count);
    }

    static void AutomorphicRenges(int st, int ed, int count) {

        if (st > ed) {
            return;
        }

        if (Automorphic.isAutomorphic(ed, ed*ed)) {
            count++;
            if (count == 2) {

                System.out.print(ed + " ");
            }

        }
        AutomorphicRenges(st, ed-1, count);
    }
}
