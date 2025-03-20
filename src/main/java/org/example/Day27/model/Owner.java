package org.example.Day27.model;

import java.util.List;

public class Owner {
    private String id;
    private String name;
    private String address;
    private String phone;
    private List<Pet> pets;

    public Owner(String id, String name, String address, String phone, List<Pet> pets) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.pets = pets;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", pets=" + pets +
                '}';
    }
}
