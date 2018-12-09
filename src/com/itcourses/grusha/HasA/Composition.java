package com.itcourses.grusha.HasA;

// Java program to illustrate
// the concept of Composition

import java.util.*;

// class book
class Book {

    public String title;
    public String author;

    Book(String title, String author) {

        this.title = title;
        this.author = author;
    }
}

// Libary class contains
// list of books.
class Library {

    // reference to refer to list of books.
    private final Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    public Book[] getTotalBooksInLibrary() {

        return books;
    }

}

// main method
public class Composition {
    public static void main(String[] args) {

        // Creating the Objects of Book class.
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

        // Creating the list which contains the
        // no. of books.
        Book[] books = new Book[3];
        books[0] = (b1);
        books[1] = (b2);
        books[2] = (b3);

        Library library = new Library(books);

        Book[] bks = library.getTotalBooksInLibrary();
        for (Book bk : bks) {

            System.out.println("Title : " + bk.title + " and "
                    + " Author : " + bk.author);
        }
    }
}
