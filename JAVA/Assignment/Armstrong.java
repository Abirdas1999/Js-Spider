import java.util.Scanner;

public class Armstrong {
     public static void main(String[] args) {
        System.out.println("Enter a number to check --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isArmstrong(n)==true){
            System.out.println("Your number is a Armstrong Number");
        }else{
            System.out.println("Your number is not a Armstrong Number");
        }

    }

    public static Boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        // Boolean flag = false;
        int len = (num + "").length();

        while (num > 0) {
            sum+=Math.pow(num%10, len);
            num/=10;
            
        }

        return sum == temp;
    }
}
