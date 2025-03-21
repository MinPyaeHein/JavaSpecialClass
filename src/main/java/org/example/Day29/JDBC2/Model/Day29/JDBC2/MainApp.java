package org.example.Day29.JDBC2.Model.Day29.JDBC2;

import org.example.Day29.JDBC2.Model.Day29.JDBC2.Model.Pet;
import org.example.Day29.JDBC2.Model.Day29.JDBC2.Service.PetService;

import java.util.List;

public class MainApp {
    public static void main(String[] args){
        List<Pet> pets= PetService.getAllPets();
        for(Pet pet : pets){
            System.out.println(pet);
        }
    }
}
