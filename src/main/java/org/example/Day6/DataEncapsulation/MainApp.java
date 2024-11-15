package org.example.Day6.DataEncapsulation;

public class MainApp {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people.getName());
        people.setName("John Doe");
        System.out.println(people.getName());
        people.setName("Min Min");
        System.out.println(people.getName());
    }
}
