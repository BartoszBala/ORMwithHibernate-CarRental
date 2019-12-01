package EmployeeModel;

import java.io.Serializable;
import java.util.List;

public interface EmployeeDAOInterface<T, Id extends Serializable> {

    public void persist(T t);
    public void update(T t);
    public void delete(T t);
    public List<T> findALl();
    public T findById(Id id);
}
