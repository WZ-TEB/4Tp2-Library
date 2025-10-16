package org.example;

public interface Library {
    String addBook(String bookName, String author, String publisher);
    void removeBook(String isbn);
    String addUser(String firstName, String lastName, String email);
    void removeUser(String userId);
    void rentBookToUser(String isbn, String userId);
    void returnBook(String isbn);
}
