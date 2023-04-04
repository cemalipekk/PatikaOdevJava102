import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> newBooks = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        
        books.add(Book.Kitap1);
        books.add(Book.Kitap2);
        books.add(Book.Kitap3);
        books.add(Book.Kitap4);
        books.add(Book.Kitap5);
        books.add(Book.Kitap6);
        books.add(Book.Kitap7);
        books.add(Book.Kitap8);
        books.add(Book.Kitap9);
        books.add(Book.Kitap10);


        books.stream().forEach(book -> map.put(book.getBookName(), book.getAuthorName()));


        books.stream().filter(book -> book.getNumberOfPage() > 100).forEach(book -> newBooks.add(book));
        newBooks.stream().forEach(book -> System.out.println(book));



    }
}
