package task.DAO;

import task.Entity.Client;

import java.util.List;
public interface ClientDAO {
    void add(Client client);



    List<Client> getAllClient ();

    void addClient(Object o);

    Client getById(int id);

    void updateAge(int age, int id);

    void remove(String name);

}
