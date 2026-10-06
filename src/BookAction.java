
@FunctionalInterface
public interface BookAction {
    void perform(Book book);

    BookAction action = book -> System.out.println(book.getTitle());
}
