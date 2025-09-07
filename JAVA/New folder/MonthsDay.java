import java.util.Scanner;

public class MonthsDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year  --> ");
        int year = sc.nextInt();
        System.out.println("Enter month number between 1 to 12  --> ");
        int month = sc.nextInt();

        switch (month) {
            case 1:

            case 3:

            case 5:

            case 7:

            case 10:

            case 12:
                System.out.println("Total days is 31");
                break;

            case 4:

            case 6:

            case 9:

            case 11:
                System.out.println("Total days is 30");
                break;

            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("Total days is 29");

                } else {
                    System.out.println("Total days is 28");

                }
                break;
            default:
                System.out.println("Enter a valid number between 1-7");
                break;
        }
    }
}
