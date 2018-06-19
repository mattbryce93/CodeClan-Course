import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.books.size();
    }

    private void addBook(Book book) {
        this.books.add(book);
    }

    public void takeBook(Library library, Book book) {
        addBook(book);
        library.removeBook(book);
    }


}
