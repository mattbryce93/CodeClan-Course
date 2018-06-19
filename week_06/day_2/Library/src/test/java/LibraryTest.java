import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("Frankenstein's Monster", "Horror");
        book2 = new Book("The Shining", "Horror");
        book3 = new Book("The Iliad", "Classics");
    }

    @Test
    public void canCountBooksInLibrary(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBooksToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
        assertEquals(1, library.countGenre("Horror"));
    }

    @Test
    public void cannotAddBookToFullLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countBooks());
        assertEquals(2, library.countGenre("Horror"));
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }
}
