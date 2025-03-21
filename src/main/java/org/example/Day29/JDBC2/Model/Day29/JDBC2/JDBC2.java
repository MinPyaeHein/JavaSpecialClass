package org.example.Day29.JDBC2.Model.Day29.JDBC2;

import java.sql.*;

public class JDBC2 {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/pet_db";
        String user="postgres";
        String password="root";

        try {
            Connection con= DriverManager.getConnection(url,user,password);
            Statement stmt=con.createStatement();//this is for select data from database
            ResultSet rs =stmt.executeQuery("select * from pets");
            while(rs.next()){
              System.out.println("ID: "+rs.getInt("id")+
                      " name :" +rs.getString("name")+
                      " age :" +rs.getInt("age")+
                      " color : " +rs.getString("color")+
                      " type :"+rs.getString("type"));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
