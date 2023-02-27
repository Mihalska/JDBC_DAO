package task_DAO;

public class Factory implements IDAOFactoryFl {

    private static IDAOFactoryFl factoryFl;

    private Factory (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static synchronized IDAOFactoryFl getInstance(){
        if (factoryFl == null){
            factoryFl = new Factory();
    }
        return factoryFl;
    }

    @Override
    public FlowerDAO getFlowerDAO() {
        return new FlowerJDBCDao();
    }
}
