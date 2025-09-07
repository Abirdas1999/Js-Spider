import java.util.Scanner;

public class Matri {
    public static void main(String[] args) {
        System.out.println("Please enter your name --> ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name + ", Please enter your age --> ");
        int age = sc.nextInt();
        if (age >= 24 && age <= 38) {
            System.out.println(name + ", Welcome to our site to explore.");
        } else if (age < 24) {
            System.out.println("Sorry! " + name + " You are under age.");
        } else {
            System.out.println("Sorry! " + name + " You are over age.");
        }

    }
}
