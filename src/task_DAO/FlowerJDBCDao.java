package task_DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class FlowerJDBCDao implements FlowerDAO{

    @Override
    public void add(Flower flower) {
        Connection connection = null;
        connection = getConnection();
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement("INSERT INTO flowers (Name,  price, freshness, length) VALUES (?, ?, ?,?)");

            statement.setString(1, flower.getName());
            statement.setInt(2, flower.getPrice());
            statement.setInt(3, flower.getFreshness());
            statement.setInt(4, flower.getLength());

            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @Override
    public List<Flower> getAll() {
            List<Flower> allFlowers = new ArrayList<>();
            Connection connection = null;
            PreparedStatement statement = null;

            try {
                connection = getConnection();
                assert connection != null;
                statement = connection.prepareStatement("SELECT  f.Name, f.price, f.freshness, f.length FROM flowers as f ");

                ResultSet rs = statement.executeQuery();

                while (rs.next()) {

                    String Name = rs.getString(1);
                    int price = rs.getInt(2);
                    int freshness = rs.getInt(3);
                    int length = rs.getInt(4);
                    Flower flower = new Flower();
                    flower.setName(Name);
                    flower.setPrice(price);
                    flower.setFreshness(freshness);
                    flower.setLength(length);
                    allFlowers.add(flower);
                }


            } catch (SQLException e) {
                e.printStackTrace();
            }
            return allFlowers;
        }

    @Override
    public Flower getById(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement("SELECT  f.Name, f.price, f.freshness, f.length FROM flowers as f WHERE f.flowers_id = ? ");

            preparedStatement.setInt(1, id);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                String name = rs.getString(1);
                int price = rs.getInt(2);
                int freshness = rs.getInt(3);
                int length = rs.getInt(4);
                Flower flower = new Flower();
                flower.setName(name);
                flower.setPrice(price);
                flower.setFreshness(freshness);
                flower.setLength(length);
                return flower;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null) {

                try {
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    @Override
    public void updatePrice(int price, int flower_id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        connection = getConnection();

        try {
            preparedStatement = connection.prepareStatement("UPDATE flowers SET price = ? WHERE flowers_id = ?");

            preparedStatement.setInt(1, price);
            preparedStatement.setInt(2, flower_id);

            int updatedValues = preparedStatement.executeUpdate();

            System.out.println("Values updated: " + updatedValues);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null) {

                try {
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }




    public void remove(int flowers_id){
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    connection = getConnection();

        try {
        preparedStatement = connection.prepareStatement("DELETE FROM flowers WHERE flowers_id = ? ");

        preparedStatement.setInt(1, flowers_id);

        int deletedValues = preparedStatement.executeUpdate();

        System.out.println("Values deleted: " + deletedValues);

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (connection != null && preparedStatement != null) {

            try {
                connection.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}




    private Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Florist", "root", "Root");
            return connection;
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
