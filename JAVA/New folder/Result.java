import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        System.out.println("Enter Your Name -> ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter Your Sub-A(Out of 100) Number -> ");
        int sub1 = sc.nextInt();
        System.out.println("Enter Your Sub-B (Out of 100) Number -> ");
        int sub2 = sc.nextInt();
        System.out.println("Enter Your Sub-C (Out of 100) Number -> ");
        int sub3 = sc.nextInt();
        System.out.println("Enter Your Sub-D (Out of 100) Number -> ");
        int sub4 = sc.nextInt();
        System.out.println("Enter Your Sub-E (Out of 100) Number -> ");
        int sub5 = sc.nextInt();
        System.out.println("Enter Your Sub-F (Out of 100) Number -> ");
        int sub6 = sc.nextInt();

        int totalMarks = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6);
        if (0 <= totalMarks && totalMarks <= 600) {
            if (totalMarks <= 600 && totalMarks >= 540) {
                System.out.println("Hi " + name + ", Your total Number is " + totalMarks + " , And Your Grade is O");
            } else if (totalMarks <= 540 && totalMarks >= 480) {
                System.out.println("Hi " + name + ", Your total Number is " + totalMarks + " , And Your Grade is E");
            } else if (totalMarks <= 480 && totalMarks >= 360) {
                System.out.println("Hi " + name + ", Your total Number is " + totalMarks + " , And Your Grade is G");
            } else if (totalMarks <= 360 && totalMarks >= 210) {
                System.out.println("Hi " + name + ", Your total Number is " + totalMarks + " , And Your Grade is A");
            }
            else {
                System.out.println("Hi " + name + ", Your total Number is " + totalMarks + " , You are not Pass,Best Of Luck!");
            }
        } else {
            System.out.println("Hii " + name + " , Your result is invalid, Try again! ");
        }

    }
}
