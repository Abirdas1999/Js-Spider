package com.Java_Core.oops.constructor.singleToned;
import java.util.Scanner;
class MovieHall{
    private int seat;
    private static MovieHall m;
    private MovieHall(){
        seat = 50;
    }

    public static MovieHall getObject(){
        if (m==null){
           return m = new MovieHall();
        }
        return m;
    }

    public void bookTicket(int ticket){
        if (ticket>seat){
            System.out.println("No seat are available");
        }else {
            seat -= ticket;
            System.out.println("Your ticket is booked");
            System.out.println("Now available seat is :" + seat);
        }
    }
}

class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        MovieHall m1 = MovieHall.getObject();
        System.out.println("How many seat want?  ...");
        int ticket = sc.nextInt();
        m1.bookTicket(ticket);

        System.out.println("------------------------------");

        MovieHall m2 = MovieHall.getObject();
        System.out.println("How many seat want?  ...");
        int ticket2 = sc.nextInt();
        m2.bookTicket(ticket2);
    }

}
