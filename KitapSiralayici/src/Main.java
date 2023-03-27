import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> bookSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPageNumber() - o1.getPageNumber();
            }
        });


        bookSet.add(new Book("Gönlümdekiler ve Ötekiler",230,"Yavuz Bülent Bakiler","01-05-2005"));
        bookSet.add(new Book("Unutamadıklarım",253,"Yavuz Bülent Bakiler","01-05-2004"));
        bookSet.add(new Book("Azerbaycan Yüreğimde Bir Şahdamardır",384,"Yavuz Bülent Bakiler","06-07-2015"));
        bookSet.add(new Book("Dilimzdeki Dikenler",288,"Yavuz Bülent Bakiler","03-07-2019"));

        for(Book book : bookSet){
            System.out.println(book.getBookName());
        }

    }
}