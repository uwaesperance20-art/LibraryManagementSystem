public class Student extends Member{

    public Student(int id, String name, String email) {
            super(id, name, email);
        }

    public Student() {
        super();
    }

    @Override
        public double calculateLateFees(int daysLate) {

            return daysLate * 150;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + getId() +
                    ", name='" + getName() + '\'' +
                    ", email='" + getEmail() + '\'' +
                    '}';
        }
    }

