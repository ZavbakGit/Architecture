package dao;

import model.intity.Mounth;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;


public class MonthDao {

    private static MonthDao instance;

    private static Connection connection;

    private HashMap<Integer, Mounth> monthMap = new HashMap<>();


    private static final String FIND_BY_ID = "SELECT * FROM month_ WHERE id = ?";
    private static final String INSERT = "INSERT INTO month_(id, name) VALUES(?,?)";
    private static final String CREATE_TABLE =
            "CREATE TABLE if not exists 'month_' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text);";


    public static MonthDao getInstance(Connection connection) throws SQLException, ClassNotFoundException {
        if (instance == null) {
            instance = new MonthDao(connection);
        }
        return instance;
    }

    public MonthDao(Connection connection) throws SQLException, ClassNotFoundException {
        this.connection = connection;
        createDB();
    }


    private void createDB() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(CREATE_TABLE)) {
            statement.executeUpdate();
        }
    }


    public void insert(Mounth mounth) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, mounth.getId());
            statement.setString(2, mounth.getName());
            statement.executeUpdate();
        }
    }

    public Mounth getUserById(int id) throws SQLException {

        if (monthMap.containsKey(id)) {
            System.out.println("got by cash!");
            return monthMap.get(id);
        }


        try (PreparedStatement statement = connection.prepareStatement(FIND_BY_ID)) {
            statement.setInt(1, id);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs != null && rs.next()) {


                    Mounth mounth =  new Mounth(
                            rs.getInt("id"),
                            rs.getString("name"));

                    monthMap.put(mounth.getId(), mounth);

                    return mounth;

                }
            }
        }

        throw new RuntimeException("No data");
    }

}
