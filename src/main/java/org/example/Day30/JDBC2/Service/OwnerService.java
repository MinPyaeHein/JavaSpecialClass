package org.example.Day30.JDBC2.Service;

import org.example.Day30.JDBC2.Dao.OwnerDao;
import org.example.Day30.JDBC2.Dao.PetDao;
import org.example.Day30.JDBC2.Model.Owner;
import org.example.Day30.JDBC2.Model.Pet;

import java.util.List;

public class OwnerService {
    public static List<Owner> getAllOwners() {
        return OwnerDao.findAllOwners();
    }
}
