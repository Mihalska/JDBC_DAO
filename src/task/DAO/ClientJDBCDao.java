package task.DAO;

public class ClientJDBCDao  implements ClientDAO{
//    @Override
//    public void add(Client client) {
//        Connection connection;
//
//        connection = getConnection();
//        PreparedStatement statement;
//
//        try {
//
//            int markId = getMarkId(car.getMark(), connection);
//
//            if (markId == -1) {
//                statement = connection.prepareStatement("INSERT INTO marks(mark) VALUES (?)");
//                statement.setString(1, car.getMark());
//                statement.execute();
//                statement = connection.prepareStatement("SELECT MAX(id) FROM marks");
//                ResultSet rs = statement.executeQuery();
//                rs.next();
//                markId = rs.getInt(1);
//            }
//
//            statement = connection.prepareStatement("INSERT INTO cars(mark_id, model, price) VALUES (?, ?, ?)");
//
//            statement.setInt(1, markId);
//            statement.setString(2, car.getModel());
//            statement.setInt(3, car.getPrice());
//
//            statement.execute();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    }
//
//    @Override
//    public List<Client> getAllClient() {
//        List<Client> allClients = new ArrayList<>();
//
//        Connection connection = null;
//        PreparedStatement statement = null;
//
//        try {
//            connection = getConnection();
//            // Выбираем набор полей, используя join
//            statement = connection.prepareStatement("SELECT * FROM clients ");
//
//            ResultSet rs = statement.executeQuery();
//// Забираем из результирующего набора получившиеся записи. Колонки это порядковые номера нашего запроса.
//            while (rs.next()) {
//                long id = rs.getLong(1);
//                String name = rs.getString(2);
//                int age = rs.getInt(3);
//                String phone = rs.getString(4);
//
//                // Создаем объекты с выгруженными данными и добавляем в коллекцию.
//                Client client = new Client();
//                client.setId(id);
//                client.setName(name);
//                client.setAge(age);
//                client.setPhone(phone);
//                allClients.add(client);
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        // Если не возникает исключительных ситуаций, то список возвращается в качестве результата.
//        return allClients;
//    }
//
//    @Override
//    public Client getById(int id) {
//        return null;
//    }
//
//    @Override
//    public void updatePrice(int price, int carId) {
//
//    }
//
//    @Override
//    public void remove(String mark) {
//
//    }
//}
