
import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number start from --> ");
        int start = sc.nextInt();
        System.out.println("Enter a number End with --> ");
        int end = sc.nextInt();

        int a = start;
        int b = start + 1;

        if(start<end){
            System.out.print(a + " " + b + " ");
            while (true) {
                int c = a + b;
                if (c <= end) {
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
    
            }
        }else{
            System.out.println("Plese enter valid range");
        }

       


        // System.out.println("Enter a number for fibonacci--> ");
        // Scanner sc = new Scanner(System.in);
        // int count = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // System.out.print(a + " " + b + " ");
        // for (int i = 3; i <= (count); i++) {
        //     int c = a + b;
        //     System.out.print(c + " ");
        //     a = b;
        //     b = c;
        // }
    }
}
