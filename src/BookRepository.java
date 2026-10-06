
    import java.util.ArrayList;
import java.util.List;

    public class BookRepository {

        private List<Book> books = new ArrayList<>();

        public void add(Book book) {
            books.add(book);
        }
        public Book findById(int id) {

            for (Book book : books) {

                if (book.getId() == id) {
                    return book;
                }
            }
            return null;
        }
        public List<Book> findAll() {
            return books;
        }
        public void delete(int id) {
            books.removeIf(book -> book.getId() == id);
        }
    }

