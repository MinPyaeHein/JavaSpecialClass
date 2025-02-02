package org.example.Day21;

import java.util.Date;

public class Vehicle {
    private String name;
    private String licen;
    private String color;
    private String model;
    private Date productionDate;
    private int numberOfVehicles;
    private String ownerEmail;

    public Vehicle(String name, String licen, String color, String model, Date productionDate, int numberOfVehicles, String ownerEmail) {
        this.name = name;
        this.licen = licen;
        this.color = color;
        this.model = model;
        this.productionDate = productionDate;
        this.numberOfVehicles = numberOfVehicles;
        this.ownerEmail = ownerEmail;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicen() {
        return licen;
    }

    public void setLicen(String licen) {
        this.licen = licen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    @Override
    public String toString() {
        return  name + "  |" +
                licen + "  |" +
                color + "  |" +
                model + "  |" +
                productionDate +"  |"+
                numberOfVehicles+"  |" +
                ownerEmail + "  |" ;
    }
}
