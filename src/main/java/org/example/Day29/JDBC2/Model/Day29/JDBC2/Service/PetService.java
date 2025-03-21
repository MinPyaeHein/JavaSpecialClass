package org.example.Day29.JDBC2.Model.Day29.JDBC2.Service;

import org.example.Day29.JDBC2.Model.Day29.JDBC2.Dao.PetDao;
import org.example.Day29.JDBC2.Model.Day29.JDBC2.Model.Pet;

import java.util.List;

public class PetService {
    public static List<Pet> getAllPets(){
        return PetDao.findAllPets();
    }
}
