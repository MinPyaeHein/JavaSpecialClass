package org.example.Day28.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDao {
    public static void connectWithDb() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection c= DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/sms_db","postgres","root");
        if(c==null){
            System.out.println("Connection failed");
        }else{
            System.out.println("Connection Successful");
        }
    }
}
