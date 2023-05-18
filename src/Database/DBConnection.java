/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DBConnection {

    static Connection connection = null;

    public static Connection get_connection() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/orders_desktop?serverTimezone=UTC";
            connection = DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }

    //---------------------------- SingIn ***
    public static boolean singInCheck(String name_Login, String password_Login) throws ClassNotFoundException {
        if (connection == null) {
            get_connection();
        } else {
            PreparedStatement statement;
            try {
                statement = connection.prepareStatement("SELECT * FROM user");
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    if (rs.getString("name").equalsIgnoreCase(name_Login)
                            && rs.getString("password").equalsIgnoreCase(password_Login)) {
                        return true;
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
        return false;
    }//END; 7M.T
//    -----

//---------------------------- SingUp ***
    public static void singUp(User user) throws ClassNotFoundException {
        if (connection == null) {
            get_connection();
        } else {
            try {
                PreparedStatement statement = connection.prepareStatement("INSERT into user VALUES (?,?,?,?,)");
                statement.setString(1, user.getFirstName());
                statement.setString(2, user.getLastName());
                statement.setString(3, user.getUserName());
                statement.setString(4, user.getPassword());
                statement.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex + " Exception (_-_)");
            }
        }
    }//END;
//    ------
}
