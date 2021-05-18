
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void setUp(){
        library = new Library(4);
        book1 = new Book("Core Java Volume I – Fundamentals", " Cay S. Horstmann", "Programming");
        book2 = new Book("Mastering Selenium WebDriver 3.0", " Mark Collin", "Testing");
    }

    @Test
    public void canBookCountInLibrary(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookInLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canAddBookIfStockIsNotFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.bookCount());
        library.addBook(book1);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void getBook(){
        library.addBook(book1);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }

}
//Write a method to count the number of books in the library.
//Write a method to add a book to the library stock.
//Add a capacity to the library and write a method to check
// if stock is full before adding a book.
