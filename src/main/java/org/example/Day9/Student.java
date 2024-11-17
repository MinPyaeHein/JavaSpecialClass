package org.example.Day9;

public class Student {
    private String name;
    private int age;
    private String phone;

    public Student(String name, int age,String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);

    }
}
