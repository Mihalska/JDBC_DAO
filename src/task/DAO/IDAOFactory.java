package task.DAO;


public interface IDAOFactory {

    CarDAO getCarDAO();

    ClientDAO getClientDAO();


}
