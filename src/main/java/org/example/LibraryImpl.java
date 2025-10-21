package org.example;

import java.util.HashMap;
import java.util.Map;

public class LibraryImpl implements Library {
    //klasa faktycznej funkcjonalności biblioteki
    //ma łączyć ze sobą Usera oraz Book
    Map<String, User> users = new HashMap<>();
    Map<String, Book> books = new HashMap<>();
    Map<String, String> rentedBooks = new HashMap<>();

    @Override
    public String addBook(String bookName, String author, String publisher) {
        Book book = new Book(bookName, author, publisher);
        books.put(book.getISBN(), book);
        return book.getISBN();
    }

    @Override
    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    @Override
    public String addUser(String firstName, String lastName, String email) {
        User user = new User(firstName, lastName, email);
        users.put(user.getUserId(), user);
        return user.getUserId();
    }

    @Override
    public void removeUser(String userId) {
        users.remove(userId);
    }

    @Override
    public void rentBookToUser(String isbn, String userId) {
        rentedBooks.put(isbn, userId);
    }

    @Override
    public void returnBook(String isbn) {
        rentedBooks.remove(isbn);
    }
}
