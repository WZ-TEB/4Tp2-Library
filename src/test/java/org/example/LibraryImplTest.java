package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    LibraryImpl testLibrary = new LibraryImpl();

    @BeforeEach
    void setUp() {
        LibraryImpl testLibrary = new LibraryImpl();
    }

    @AfterEach
    void tearDown() {
        testLibrary = null;
    }

    @Test
    void addBook() {
        //given - dane wejsciowe testu

        //when - miejsce w ktorym wywolujemy metode testowana
        // 1a. może być String testIsbn = testLibrary.addBook("testBookName", "testAuthor", "testPublisher");
        testLibrary.addBook("testBookName", "testAuthor", "testPublisher");
        //then - assert ktory sprawdza nam poprawnosc testu
        assertEquals(1, testLibrary.books.size());
        // 1a. wtedy może być np. assertTrue(testLibrary.books.containsKey(testIsbn));
    }

    @Test
    void removeBook() {
        //given
        String testIsbn = testLibrary.addBook("testBookName", "testAuthor", "testPublisher");
        //when
        testLibrary.removeBook(testIsbn);
        //then
        assertEquals(0, testLibrary.books.size());
        assertFalse(testLibrary.books.containsKey(testIsbn));
        assertTrue(testLibrary.books.isEmpty());
    }

    @Test
    void addUser() {
        //given
        //when
        String testUserId = testLibrary.addUser("testFirstName", "testLastName", "testEmail");
        //then
        assertTrue(testLibrary.users.containsKey(testUserId));
    }

    @Test
    void removeUser() {
        //given
        String testUserId = testLibrary.addUser("testFirstName", "testLastName", "testEmail");
        //when
        testLibrary.removeUser(testUserId);
        //then
        assertFalse(testLibrary.users.containsKey(testUserId));
    }

    @Test
    void rentBookToUser() {
        //given
        String testUserId = testLibrary.addUser("testFirstName", "testLastName", "testEmail");
        String testIsbn = testLibrary.addBook("testBookName", "testAuthor", "testPublisher");
        //when
        testLibrary.rentBookToUser(testIsbn, testUserId);
        //then
        assertTrue(testLibrary.rentedBooks.containsKey(testIsbn));
    }

    @Test
    void returnBook() {
        //given
        String testIsbn = testLibrary.addBook("testBookName", "testAuthor", "testPublisher");
        String testUserId = testLibrary.addUser("testFirstName", "testLastName", "testEmail");
        testLibrary.rentBookToUser(testIsbn, testUserId);
        //when
        testLibrary.returnBook(testIsbn);
        //then
        assertFalse(testLibrary.rentedBooks.containsKey(testIsbn));
    }
}