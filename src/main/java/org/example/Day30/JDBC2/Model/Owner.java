package org.example.Day30.JDBC2.Model;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private int id;
    private String name;
    private String gender;
    private String address;
    private String phone;
    private String email;
    private List<Pet> pets;

    public Owner(int id, String name, String gender, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.pets = new ArrayList<Pet>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addPet(Pet pet){
        this.pets.add(pet);
    }
    public void addAllPets(List<Pet> pets){
        this.pets.addAll(pets);
    }
    public void displayPets(){
        for(Pet pet:pets){
            System.out.println(pet);
        }
    }


    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", pets=" + pets +
                '}';
    }
}
