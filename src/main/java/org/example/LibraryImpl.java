package org.example;

import java.util.Map;

public class LibraryImpl implements Library {

    Map<String, User> users;
    Map<String, Book> books;
    Map<String, String> rentedBooks;

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

    }

    @Override
    public void returnBook(String isbn) {

    }
}
