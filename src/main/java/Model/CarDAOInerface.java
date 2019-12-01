package Model;

import java.io.Serializable;
import java.util.List;

public interface CarDAOInerface<T, Id extends Serializable> {

    public void persist(T entity);
    public void update(T entity);
    public void delete(T entity);
    public List<T> findAll();
    public T findById(Id id);
}
