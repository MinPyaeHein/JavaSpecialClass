package org.example.Day28;

import org.example.Day28.dao.ConnectionDao;
import org.example.Day28.service.PetService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class PetOwnerSystem {
    public static void main(String[] args) throws IOException {
        PetService petService = new PetService();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter owner's phone:");
        String phone=reader.readLine();
        petService.displayPetsByOwnerPhone(phone);

        try {
            ConnectionDao.connectWithDb();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
