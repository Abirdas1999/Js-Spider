
import java.util.Scanner;

public class EvenRengeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number --> ");
        int st = sc.nextInt();
        System.out.println("Enter ending number --> ");
        int ed = sc.nextInt();

        System.out.println(EvenAdd(st, ed)); //2 4 6 8 10 ==30
    }

    static int EvenAdd(int st, int ed) {
        if (st > ed) {
            return 0;
        }
        if (st % 2 == 0) {
            return st + EvenAdd(st + 1, ed);

        } else {
            return EvenAdd(st + 1, ed);
        }

    }

}
