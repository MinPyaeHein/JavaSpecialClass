package org.example.Day28.service;

import org.example.Day28.model.Owner;
import org.example.Day28.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetService {
    private static List<Pet> pets=new ArrayList<Pet>();
    private static List<Owner> owners = new ArrayList<Owner>();
    static{
        Pet pet1=new Pet(1,"John","Dawei","09/08/2022",0.99);
        Pet pet2=new Pet(2,"Taza","Dawei","09/08/2022",0.99);
        Pet pet3=new Pet(3,"Crystal","Dawei","09/08/2022",0.99);
        Pet pet4=new Pet(4,"Nyo Nyo","Dawei","09/08/2022",0.99);
        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
        pets.add(pet4);
        Owner owner = new Owner("1","John","Dawei","09423523532",pets);
        Owner owner1 = new Owner("2","Marry","Dawei","09423523533",pets);
        owners.add(owner);
        owners.add(owner1);
    }
    public  void displayPetsByOwnerPhone(String phone){
        Owner foundOwner=null;
        for(Owner owner : owners){
            if(owner.getPhone().equals(phone)) {
                foundOwner = owner;
                break;
            }
        }
        if(foundOwner==null){
            System.out.println("Owner not found");
        }else{
            System.out.println("Pets owned by "+foundOwner.getName());
            for(Pet pet: foundOwner.getPets()){
                System.out.println(pet);
            }
        }




    }
}
