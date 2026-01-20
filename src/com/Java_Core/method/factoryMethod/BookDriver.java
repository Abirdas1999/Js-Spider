package com.Java_Core.method.factoryMethod;

import java.util.Scanner;

class Book{
    String name;
    String author;
    int price;

    public static Book getBook(){
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name--> ");
        b.name=sc.next();
        System.out.println("Enter Book Author--> ");
        b.author=sc.next();
        System.out.println("Enter Book Price--> ");
        b.price=sc.nextInt();

//        return new Book();
        return b;
    }

    public void displayBook(){
        System.out.println("Name :"+name+"\nAuthor :"+author+"\nPrice :"+price);
    }
}
class BookDriver {
    public static void main(String[] args) {
        Book b1 = Book.getBook();
//        Book b2 = Book.getBook();

        b1.displayBook();
//        b2.displayBook();

    }
}
