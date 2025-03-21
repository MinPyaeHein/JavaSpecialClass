package org.example.Day30.JDBC2.Dao;



import org.example.Day30.JDBC2.Model.Owner;
import org.example.Day30.JDBC2.Model.Pet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OwnerDao {
    public static List<Owner> findAllOwners(){
        List<Owner> owners=new ArrayList<>();
        Connection con= DatabaseConnection.getConnection();
        try {
            Statement stmt =con.createStatement();
            ResultSet rs =stmt.executeQuery("select * from owners");
            while(rs.next()){
                Owner owner=new Owner(
                         rs.getInt("id")
                        ,rs.getString("name")
                        ,rs.getString("gender")
                        ,rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("email"));
                List<Pet> pets=PetDao.findPetsByOwnerId(owner.getId());
                for(Pet pet : pets){
                    owner.addPet(pet);
                }

                owners.add(owner);


            }
            con.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return owners;
    }
}
