/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saree
 */
import java.sql.*;
import javax.swing.*;
public class MySqlConnect {
    
    Connection conn =null;
    public static Connection ConnectDB(){
        
         // Provide a try and catch exception
        try {
            // Connect to mysql library
            Class.forName("com.mysql.jdbc.Driver");
            // jdbc:mysql://hostname:port/databasename, server username, server password
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db_list","root","");
            return conn;
            
        }catch(Exception ex) {
            // If connection fail
            System.out.println("Erro: " + ex);
            return null;
        }

    }
    
}
    
