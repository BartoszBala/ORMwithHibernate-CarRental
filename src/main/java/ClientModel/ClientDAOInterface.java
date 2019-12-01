package ClientModel;

import java.io.Serializable;
import java.util.List;

public interface ClientDAOInterface<T, Id extends Serializable> {

    public void persist(T t);
    public void delete(T t);
    public void update(T t);
    public List<T> findAll();
    public T findByID(Id id);
}
