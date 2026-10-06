import java.util.List;

public class LibraryUtilities {
    public static void displayBook(List<?extends Book> books){
        for (Book book:books){
            System.out.println(book);
        }
    }
    public static void AddBooks(List<? super Book>books,Book book){
        books.add(book);
    }
}
