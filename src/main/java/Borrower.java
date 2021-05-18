import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }


    public void add(Book book) {
        this.collection.add(book);
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void borrowBook(Library library) {
        Book book = library.removeBook();
        this.add(book);
    }
}
