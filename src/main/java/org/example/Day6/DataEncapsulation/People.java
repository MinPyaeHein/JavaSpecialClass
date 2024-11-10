package org.example.Day6.DataEncapsulation;

public class People {
    private String name;
    private String age;
    private String address;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name.length()<=10){
            throw new IllegalArgumentException("Name should not exceed 10 characters");
        }
        this.name = name;
    }
}
