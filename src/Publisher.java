public class Publisher extends Member {

    public Publisher(int id, String name, String email) {
        super(id, name, email);
    }

    public Publisher() {

    }

    @Override
    public double calculateLateFees(int daysLate) {

        return daysLate * 250;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}

