import java.util.Scanner;

public class AutomorphicRenge {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number to get AutomorphicRenge number--> ");
        int start = sc.nextInt();

        System.out.println("Enter last number to get AutomorphicRenge number--> ");
        int end = sc.nextInt();
        AutomorphicRenges(start, end);
    }

    static void AutomorphicRenges(int st, int ed) {

        if (st > ed) {
            return;
        }

        if (Automorphic.isAutomorphic(st, st*st)) {
            System.out.print(st + " ");

        }
        AutomorphicRenges(st + 1, ed);
    }

}
