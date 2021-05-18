//Add a third class which interacts with the other two.
// E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Library library;

    @Before
    public void setUp(){
        borrower = new Borrower("Sandy");
        book1 = new Book("Core Java Volume I – Fundamentals", " Cay S. Horstmann", "Programming");
        book2 = new Book("Mastering Selenium WebDriver 3.0", " Mark Collin", "Testing");


        library = new Library(4);
        library.addBook(book1);
        library.addBook(book2);

    }

    @Test
    public void canAddBookToBorrowCollection(){
        borrower.add(book1);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canRemoveRemoveBookFromLibrary(){
        borrower.borrowBook(library);
        assertEquals(1, library.bookCount());
        assertEquals(1, borrower.bookCount());

    }

}
