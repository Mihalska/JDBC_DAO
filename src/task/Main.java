package task;

import task.DAO.CarDAO;
import task.DAO.DAOFactory;
import task.DAO.IDAOFactory;
import task.Entity.Car;


public class Main {

    public static void main(String[] args) {
        IDAOFactory factory = DAOFactory.getInstance();
        CarDAO carDAO = factory.getCarDAO();

        Car car = new Car();
        car.setMark("Lada");
        car.setModel("Priora");
        car.setPrice(8000);
        carDAO.add(car);

        System.out.println(car.getId() + " " + car.getMark()
                    + " " + car.getModel() + " " + car.getPrice());


    }

}

