import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(2);
        book = new Book("The Iliad", "Classical Mythology");
    }

    @Test
    public void borrowerCanRemoveBookFromLibrary() {
        library.addBook(book);
        borrower.takeBook(library, book);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.countBooks());
    }
}
