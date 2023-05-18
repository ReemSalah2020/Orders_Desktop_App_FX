/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class DBConnection {
    public static Connection get_connection() throws ClassNotFoundException{
        Connection connection = null;
        try {
         Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/orders_desktop?serverTimezone=UTC";
            connection = DriverManager.getConnection(url,"root","");
        }catch (Exception ex) {
            ex.printStackTrace();
        } 
        return connection;
    }
}
