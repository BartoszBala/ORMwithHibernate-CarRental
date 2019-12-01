package ClientModel;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


@Getter
@Setter
public class ClientDAO implements ClientDAOInterface<Client,Long> {

    private Session session;
    private Transaction transaction;

 public static SessionFactory getSessionFactory(){
     Configuration configuration = new Configuration().configure();
     SessionFactory sessionFactory= configuration.buildSessionFactory();

     return sessionFactory;

 }


 public Session openSession(){

    session= getSessionFactory().openSession();
    return session;

 }

    public Session openSessionWithTransaction(){

        session= getSessionFactory().openSession();
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

    @Override
    public void persist(Client client) {

     getSession().save(client);

    }

    @Override
    public void delete(Client client) {
getSession().delete(client);
    }

    @Override
    public void update(Client client) {
getSession().update(client);
    }

    @Override
    public List<Client> findAll() {

     List<Client> clients = getSession().createQuery("from Client").list();

     return clients;
    }

    @Override
    public Client findByID(Long id) {

     Client client = getSession().get(Client.class,id);

     return client;
    }
}
