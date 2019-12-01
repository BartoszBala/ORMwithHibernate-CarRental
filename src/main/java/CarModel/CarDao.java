package CarModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class CarDao implements CarDAOInerface<Car, Long>{

    private Session session;
    private Transaction transaction;

    public static SessionFactory getSessionFactory(){
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        return sessionFactory;
    }

    public Session openSession(){

        session=getSessionFactory().openSession();
        return session;

    }

    public Session openSessionWithTransaction(){

        session=getSessionFactory().openSession();
        transaction=session.beginTransaction();
        return session;

    }

    public void closeSessionWithTransaction(){

        transaction.commit();
        session.close();

    }

    public void closeSession(){

        session.close();
    }


    public void persist(Car car) {
     getSession().save(car);

    }

    public void update(Car car) {
getSession().update(car);
    }

    public void delete(Car car) {
getSession().delete(car);
    }

    public List<Car> findAll() {

        List<Car> cars = getSession().createQuery("from Car").list();  //tutaj jest ważna rzecz bo podajemy nazwę klasy
        return cars;
    }

    public Car findById(Long id) {
    Car car =   getSession().get(Car.class,id);

        return car;
    }
}
