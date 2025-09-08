
import java.util.Scanner;

public class AutomorphicAlter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number to get Automorphic number--> ");
        int start = sc.nextInt();

        System.out.println("Enter last number to get Automorphic number--> ");
        int end = sc.nextInt();
        int count = 0;
        AutomorphicRenge(start, end, count);
    }

    static void AutomorphicRenge(int st, int ed, int count) {

        if (st > ed) {
            return;
        }

        if (Automorphic.isAutomorphic(st, st * st)) {
            count++;
            if (count % 2 != 0) {

                System.out.print(st + " ");
            }

        }
        AutomorphicRenge(st + 1, ed, count);
    }
}
