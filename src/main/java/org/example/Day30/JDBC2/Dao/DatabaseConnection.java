package org.example.Day30.JDBC2.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
   private static String url="jdbc:postgresql://localhost:5432/pet_db";
   private static String user="postgres";
   private static String password="root";
   public static Connection getConnection(){
       try {
           return DriverManager.getConnection(url,user,password);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
   }

}
