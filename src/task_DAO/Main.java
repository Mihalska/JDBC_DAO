package task_DAO;

public class Main {
    public static void main(String[] args) {
        IDAOFactoryFl factoryFl = Factory.getInstance();
        FlowerDAO flowerDAO = factoryFl.getFlowerDAO();

 //-------------метод add(flower)--------
//        Flower flower = new Flower();
//        flower.setName("Poза");
//        flower.setPrice(50);
//        flower.setFreshness(5);
//        flower.setLength(100);
//        flowerDAO.add(flower);

//       -------------метод getAll()--------

//        List<Flower>flowers = flowerDAO.getAll();
//        for (Flower flower : flowers) {
//            System.out.println(flower.getName() + " " + flower.getPrice()
//                    + " " + flower.getFreshness() + " " + flower.getLength());
//        }

 //       -------------метод getById()--------

//        Flower flower1 = flowerDAO.getById(2);
//        System.out.println(flower1.getName() + " " + flower1.getPrice()
//                    + " " + flower1.getFreshness() + " " + flower1.getLength());


// ---------------------метод remove()--------
 //       flowerDAO.remove(1);

// -------------------метод updatePrice ()-----
        flowerDAO.updatePrice(60, 2);

    }
}
