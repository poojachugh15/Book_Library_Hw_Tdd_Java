import java.util.ArrayList;


public class Library {
    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        if(bookCount() < this.capacity) {
            this.bookCollection.add(book);
        }
    }

    public int bookCount() {
        return this.bookCollection.size();
    }

    public Book removeBook(){
        return this.bookCollection.remove(0);
    }
}
//Create your own library class with an internal collection of books.

