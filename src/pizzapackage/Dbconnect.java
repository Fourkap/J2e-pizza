package pizzapackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {

    public static Connection getConnection() throws Exception {

        String login="root";
        String password="";
        String url="jdbc:mysql://localhost/pizza";

        Connection cn=null;

        Class.forName("com.mysql.jdbc.Driver");

        cn= DriverManager.getConnection(url, login, password);

        return cn;
    }
}
