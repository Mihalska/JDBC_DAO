package task_DAO;

import java.util.List;
public interface FlowerDAO {

    void add(Flower flower);

    List<Flower> getAll();

     Flower  getById(int flowers_id);

   void updatePrice(int price, int flower_Id);

     void remove(int id);

}

