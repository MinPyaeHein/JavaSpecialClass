package org.example.Day29.JDBC2.Model.Day29.JDBC2.Dao;


import org.example.Day29.JDBC2.Model.Day29.JDBC2.Model.Pet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PetDao {
    public static List<Pet> findAllPets(){
        List<Pet> pets=new ArrayList<>();
        Connection con= DatabaseConnection.getConnection();
        try {
            Statement stmt =con.createStatement();
            ResultSet rs =stmt.executeQuery("select * from pets");
            while(rs.next()){
                Pet pet=new Pet(
                         rs.getInt("id")
                        ,rs.getString("name")
                        ,rs.getInt("age")
                        ,rs.getString("color"),
                        rs.getString("type"));
                System.out.println(pet);
                pets.add(pet);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pets;
    }
}
