package EmployeeModel;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.List;
@Getter
@Setter
public class EmployeeDAO implements EmployeeDAOInterface<Employee,Long> {
    private Session session;
    private Transaction transaction;


    public static SessionFactory getSessionFactory(){

        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        return sessionFactory;
    }

    public Session openSession(){

        session = getSessionFactory().openSession();

        return session;
    }

    public Session openSessionWithTransaction(){

   session = getSessionFactory().openSession();
        transaction = session.beginTransaction();
        return session;
    }

    public void closeSessionWithTransaction(){

        transaction.commit();
        session.close();

    }

    public void closeSession(){

        session.close();
    }


    @Override
    public void persist(Employee employee) {

        getSession().save(employee);

    }

    @Override
    public void update(Employee employee) {
getSession().update(employee);
    }

    @Override
    public void delete(Employee employee) {
getSession().delete(employee);
    }

    @Override
    public List<Employee> findALl() {

        List<Employee> employees = getSession().createQuery("from Employee").list();

        return employees;
    }

    @Override
    public Employee findById(Long id) {

        Employee employee = getSession().get(Employee.class,id );
        return employee;
    }
}
