package org.example;

import java.util.UUID;

public class Book {
    //klasa odnosząca się tylko do książki w próżni
    //zawiera tylko dane książki, konstruktor, gettery & settery
    private String bookName;
    private String author;
    private String publisher;
    private final String ISBN;

    public Book(String bookName, String author, String publisher) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = UUID.randomUUID().toString();
        //ID jest generowane automatycznie jako UUID
        //oszczedza nam to problemow z powtarzalnoscia ID
        //(mimo ze nie jest do konca poprawne, ISBN to cos innego)
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }
}
