import java.util.List;

public interface Repository<T> {

        void add(T item);

        T findById(int id);

        List<T> findAll();

        void delete(int id);
    }

