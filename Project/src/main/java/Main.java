import dao.MonthDao;
import dao.UsersDao;
import model.intity.Mounth;
import model.intity.User;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {

        Class.forName("org.sqlite.JDBC");
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db")) {
            User user = new User(1, "Alex", "3333");
            User user1 = new User(2, "Max", "555");

            //Datamapper
            UsersDao usersDao = UsersDao.getInstance(connection);
            try {
                usersDao.insert(user);
                usersDao.insert(user1);
            } catch (SQLException e) {
                //e.printStackTrace();
            }

            System.out.println(usersDao.getUserById(1));
            System.out.println(usersDao.getUserById(2));

            //Identitymap

            MonthDao monthDao = MonthDao.getInstance(connection);

            Mounth mounth = new Mounth(1,"January");
            Mounth mounth1 = new Mounth(2,"February");

            try {
                monthDao.insert(mounth);
                monthDao.insert(mounth1);
            } catch (Exception e) {
                //e.printStackTrace();
            }

            System.out.println(monthDao.getUserById(1));
            System.out.println(monthDao.getUserById(1));
            System.out.println(monthDao.getUserById(2));
            System.out.println(monthDao.getUserById(2));



        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
