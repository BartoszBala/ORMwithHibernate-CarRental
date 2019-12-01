package ClientModel;

import java.util.List;

public class ClientServices {

    private ClientDAO clientDAO;

    public ClientServices() {
     clientDAO = new ClientDAO();
    }


    public void persist(Client client){
        clientDAO.openSessionWithTransaction();
        clientDAO.persist(client);
        clientDAO.closeSessionWithTransaction();

    }

    public void update(Client client){
        clientDAO.openSessionWithTransaction();
        clientDAO.update(client);
        clientDAO.closeSessionWithTransaction();

    }

    public void delete(Client client){
        clientDAO.openSessionWithTransaction();
        clientDAO.delete(client);
        clientDAO.closeSessionWithTransaction();

    }

    public List<Client> findAllClient(){
        clientDAO.openSession();
        List<Client> clients = clientDAO.findAll();
        clientDAO.closeSession();
        return clients;
    }

    public Client findClientById(Long id){
        clientDAO.openSession();
      Client client=  clientDAO.findByID(id);
        clientDAO.closeSession();
        return client;
    }
}
