import java.util.*;

public class LibrayCollections {

    List<Book>books=new ArrayList<>();
    Set<Integer> borrowedBooks=new HashSet<>();
    Map<Integer,Member>members=new HashMap<>();

    // Add book
    public void addBook(Book book){
        books.add(book);
    }
    //display book
    public void displayBooks(){
        for (Book book:books){
                System.out.println(book);
            }
        }
        public void SearchBook(int bookId){
        for (Book book:books) {
            if (book.getId() == bookId) {
                System.out.println("book id is found" + bookId);
            } else {
                System.out.println("book id not found" + bookId);
            }
        }
        }


// Books borrowed
    public boolean isBorrowed(int id){
        for (Book book:books){
            if(book.isBorrowed()){
                System.out.println("the book is already borrowed");
            }else {
                System.out.println(" the book is still available");
            }
        }
        return false;
    }
    //Return books
    public void returnBook(int bookId){
        for (Book book:books){
            if (book.getId()==bookId){
                System.out.println("book returned successful");
            } else {
                System.out.println("not yet returned");
            }
        }
    }
    // Adding members
    public void addMember(Member member){
        members.put(member.getId(), member);
    }
    public void displayMember(int memberId){
        for (Member member: members.values()){
                System.out.println(member);
            }
        }
        public void SearchMember(int membeId){
        for (Member member:members.values()){
            if (member.getId()==membeId){
                System.out.println("this members id found");
            }else {
                System.out.println("member id not found");
            }
        }
        }
    }


