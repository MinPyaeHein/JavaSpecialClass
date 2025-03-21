package org.example.Day30.JDBC2;

import org.example.Day30.JDBC2.Model.Owner;
import org.example.Day30.JDBC2.Model.Pet;
import org.example.Day30.JDBC2.Service.OwnerService;
import org.example.Day30.JDBC2.Service.PetService;

import java.util.List;

public class MainApp {
    public static void main(String[] args){
//        List<Pet> pets= PetService.getAllPets();
//        for(Pet pet : pets){
//            System.out.println(pet);
//        }
        List<Owner> owners= OwnerService.getAllOwners();
        for(Owner owner : owners){
            System.out.println(owner);
        }
    }
}
