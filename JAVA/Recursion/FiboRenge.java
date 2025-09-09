
import java.util.Scanner;
// static int count =0;

public class FiboRenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number to get Fibonacci number--> ");

        int start = sc.nextInt();

        System.out.println("Enter last number to get Fibonacci number--> ");
        int end = sc.nextInt();
        int count = 1;
        FibRenge(0,1,count,start, end);

    }

    
    static void FibRenge(int a ,int b,int count,int st, int ed) {
        
        if (count > ed) {
            return;
        }

        if (count >= st && count <= ed) {
            System.out.print(a+" ");
        }

        FibRenge(b,a+b,count+1,st,ed);
    }

}
