import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        System.out.println("Enter a number to check --> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isAutomorphic(n)==true){
            System.out.println("Your number is a Automorphic Number");
        }else{
            System.out.println("Your number is not a Automorphic Number");
        }

    }

    public static Boolean isAutomorphic(int num) {
        int sqt = num*num;
        Boolean flag = true;

        while (num > 0) {
            if (num%10!=sqt%10) {
                flag=false;
                break;
            }
            num/=10;
            sqt/=10;
        }

        return flag;
    }
}
