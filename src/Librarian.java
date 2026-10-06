public class Librarian extends Member{
    public Librarian(int id, String name, String email) {
        super(id, name, email);
    }

    public Librarian() {

    }

    @Override
    public double calculateLateFees(int daysLate) {
        return 0;
    }
}
