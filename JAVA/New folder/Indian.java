
import java.util.Scanner;

public class Indian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mobile number to verify --> ");
        // int num = sc.nextInt();//give a eror
        long num = sc.nextLong();
        int len = (num + "").length();
        
        if(len==10){
            num/=100000000;
            // System.out.println(num);
            if(num>=60 && num<=99){
                System.out.println("Your Number is belongs to Indian SIM Card");
            }else{
                System.out.println("Your Number is illigal!");
            }

        }else{
            System.out.println("Your Number is invalid! ");
        }
    }
}
