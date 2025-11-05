package com.javaAbir.oops.interfaceAll;
import java.util.Scanner;

interface Recruitment{
    void isHiring();
    public default void noHiring(){
        System.out.println("No vacancy available");
    }
}
class Hr implements Recruitment{
    @Override
    public void isHiring() {
        System.out.println("Hiring is going on in HR department");
    }
}
class Development implements Recruitment{
    @Override
    public void isHiring() {
        System.out.println("Hiring is going on in Development department");
    }
}
class Sales implements Recruitment{
    @Override
    public void isHiring() {
        System.out.println("Hiring is going on in Sales department");
    }
}
class Vacancy{
    void isVacancy(Recruitment r){
        r.isHiring();
    }

}
public class EmployeeDept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are You want to hire? -->\n1.Yes \n2.No");
        int m = sc.nextInt();
        if (m==1){
            //for hiring
            System.out.println("In which department want to Hiring? -->\n1.HR \n2.Development\n3.Sales");
            int n = sc.nextInt();

            Vacancy v = new Vacancy();
            if (n==1){
                v.isVacancy(new Hr());
            } else if (n==2) {
                v.isVacancy(new Development());
            } else if (n==3) {
                v.isVacancy(new Sales());
            }else {
                System.out.println("Wrong Input...");
            }
        } else if (m==2) {
            //❌here i want to execute default method in interface...❌
            System.out.println("OK");
        }else {
            System.out.println("Wrong Input...");
        }

    }
}
