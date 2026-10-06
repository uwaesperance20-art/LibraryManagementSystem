
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // This object manages all books, borrowed books, and members
        LibrayCollections library = new LibrayCollections();

        boolean running = true;

        //  MAIN SYSTEM

        while (running) {
            System.out.println("************************************");
            System.out.println("   LIBRARY MANAGEMENT SYSTEM         ");
            System.out.println("***************************************");

            System.out.println("Choose your role:");
            System.out.println("1. Student");
            System.out.println("2. Publisher");
            System.out.println("3. Librarian");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int role = Integer.parseInt(scanner.nextLine());

            Member member = null;

            // CREATE MEMBER

            if (role == 1) {
                System.out.println("****Student Registration********");
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter Name: ");
                String name = scanner.next();
                scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                member = new Student(id, name, email);

            } else if (role == 2) {
                System.out.println("****** Publisher Registration******");

                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter Name: ");
                String name = scanner.next();
                scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();

                member = new Publisher(id, name, email);

            } else if (role == 3) {
                System.out.println("***** Librarian Registration *******");

                System.out.print("Enter ID: ");
                int id = scanner.nextInt();

                System.out.print("Enter Name: ");
                String name = scanner.next();
                scanner.nextLine();

                System.out.print("Enter Email: ");
                String email = scanner.nextLine();

                member = new Librarian(id, name, email);

            } else if (role == 4) {

                // Stop the whole program
                System.out.println("Thank you for using the Library System!");
                running = false;
                continue;

            } else {

                System.out.println("Invalid role. Try again.");
                continue;
            }



            // Add the selected user to the members Map
            library.addMember(member);

            System.out.println("Welcome " + member.getName() + " (" + member.getClass().getSimpleName() + ")"
            );
            // LIBRARY MENU

            boolean loggedIn = true;
            while (loggedIn) {
                System.out.println("**************************");
                System.out.println("*********** MENU ********");
                System.out.println("****************************");
                System.out.println("1. Add Book");
                System.out.println("2. Display All Books");
                System.out.println("3. Search Book");
                System.out.println("4. Check Book Borrowing");
                System.out.println("5. Return Book");
                System.out.println("6. Add Member");
                System.out.println("7. Display Members");
                System.out.println("8. Search Member");
                System.out.println("9. Calculate Late Fee");
                System.out.println("10. Logout");

                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                // ADD BOOK

                if (choice == 1) {

                    System.out.println("*******Add New Book ******");

                    System.out.print("Book ID: ");
                    int bookId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Publisher ID: ");
                    int publisherId =
                            Integer.parseInt(scanner.nextLine());

                    System.out.print("Publication Date: ");
                    String publicationDate = scanner.nextLine();

                    // Create a Book object
                    Book book = new Book(bookId, title, author, publisherId, publicationDate);

                    // Store the book in the List
                    library.addBook(book);
                    System.out.println("Book added successfully.");
                }


                // DISPLAY BOOKS

                else if (choice == 2) {
                    System.out.println("***** ALL BOOKS *****");
                    library.displayBooks();
                }
                // SEARCH BOOK

                else if (choice == 3) {

                    System.out.print("Enter Book ID: ");
                    int bookId =
                            Integer.parseInt(scanner.nextLine());

                    library.SearchBook(bookId);
                }
                // CHECK BORROWING

                else if (choice == 4) {

                    System.out.print("Enter Book ID: ");
                    int bookId = Integer.parseInt(scanner.nextLine());
                    library.isBorrowed(bookId);
                }

                //  RETURN BOOK

                else if (choice == 5) {

                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    library.returnBook(bookId);
                }
                // ADD MEMBER

                else if (choice == 6) {
                    System.out.println("**** Add New Member *****");
                    System.out.print("Member ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Member Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Member Email: ");
                    String email = scanner.nextLine();

                    // For simplicity, a new member is registered as Student
                    Member newMember = new Student(id, name, email);
                    library.addMember(newMember);
                    System.out.println("Member added successfully.");
                }

                // DISPLAY MEMBERS

                else if (choice == 7) {
                    System.out.println("***** ALL MEMBERS *****");
                    library.displayMember(member.getId());
                }
                // SEARCH MEMBER
                else if (choice == 8) {
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    library.SearchMember(memberId);
                }
                //  LATE FEE
                else if (choice == 9) {
                    System.out.println("***** LATE FEE *****");
                    System.out.print("Enter number of days late: ");
                    int daysLate = scanner.nextInt();
                    scanner.nextLine();

                    // Polymorphism:
                    // Student, Publisher and Librarian
                    // calculate their fees differently.
                    double fee = member.calculateLateFees(daysLate);

                    System.out.println("Member: " + member.getName());
                    System.out.println("Late fee: " + fee + " RWF");
                }
                //  LOGOUT
                else if (choice == 10) {

                    loggedIn = false;
                    System.out.println("You have logged out successfully.");
                }
                else {System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        scanner.close();
    }
}