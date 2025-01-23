import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book {

    String title, author, ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static void addBook(List<Book> collectionName, Book Book) {
        collectionName.add(Book);
        System.out.println(Book.title + " successfully added");
    }

    public static void removeBook(List<Book> nameOfCollection, String bookISBN) {
        boolean isRemovedBook = false;
        boolean bookExist = false;
        String bookTitle = "";

        // implement an iterator interface to loop through the items
        Iterator<Book> collectionIterator = nameOfCollection.iterator();
        while (collectionIterator.hasNext()) {
            Book currentBook = collectionIterator.next();
            if(currentBook.ISBN.equals(bookISBN)) {
                bookTitle = currentBook.title;
                nameOfCollection.remove(currentBook);
                isRemovedBook = bookExist = true;
                break;
            }

        }

        if(!bookExist) System.out.println("Book with the ISBN: " + bookISBN + " not found in the collection");
        if( isRemovedBook ) System.out.println(bookTitle + " successfully removed");

    }

    public static void main(String[] args) {

        List<Book> bookCollection = new ArrayList<>();
        
        Book book1 = new Book("Book Title 1","Ben Carson","123-456-0");
        Book book2 = new Book("Book Title 2","Mark Gregor","123-456");
        Book book3 = new Book("Book Title 3","Bill Gate","123-666-0");
    
        addBook(bookCollection, book1);
        addBook(bookCollection, book2);
        addBook(bookCollection, book3);
        removeBook(bookCollection, "123-66-0");
    
        System.out.println("End of program");
    
    }

}



