package org.example.Day28.model;

public class Pet {
    private int id;
    private String name;
    private String type;
    private String dob;
    private double weight;
    private Owner owner;

    public Pet(int id, String name, String type, String dob, double weight) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.dob = dob;
        this.weight = weight;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", dob='" + dob + '\'' +
                ", weight=" + weight +
                '}';
    }
}
