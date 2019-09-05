package dao;

import model.intity.User;

import java.sql.*;

public class UsersDao {

   private static UsersDao instance;

    private static Connection connection;


    private static final String FIND_BY_ID = "SELECT * FROM users WHERE id = ?";
    private static final String INSERT = "INSERT INTO users(id, name, phone) VALUES(?,?,?)";
    private static final String CREATE_TABLE =
            "CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text, 'phone' INT);";


    public static UsersDao getInstance(Connection connection) throws SQLException, ClassNotFoundException {
        if (instance == null){
            instance = new UsersDao(connection);
        }
        return instance;
    }

    public UsersDao(Connection connection) throws SQLException, ClassNotFoundException {
        this.connection = connection;
        createDB();
    }


    private void createDB() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(CREATE_TABLE)) {
            statement.executeUpdate();
        }
    }


    public void insert(User user)throws SQLException{
        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, user.getId());
            statement.setString(2, user.getName());
            statement.setString(3, user.getPhone());
            statement.executeUpdate();
        }
    }

    public User getUserById(int id) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement(FIND_BY_ID)) {
            statement.setInt(1, id);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs != null && rs.next()) {


                    return new User(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("phone"));

                }
            }
        }

        throw new RuntimeException("No data");
    }

}
