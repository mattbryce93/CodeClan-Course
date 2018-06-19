import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> ledger;

    public Library(int capacity) {
        this.ledger = new HashMap<String, Integer>();
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (countBooks() < this.capacity) {
            this.books.add(book);
            if (this.ledger.containsKey(book.getGenre())) {
                int total = this.ledger.get(book.getGenre()) + 1;
                this.ledger.remove(book.getGenre());
                this.ledger.put(book.getGenre(), total);
            } else {
                this.ledger.put(book.getGenre(), 1);
            }
        }
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public int countGenre(String key) {
            return this.ledger.get(key);
        }

}
