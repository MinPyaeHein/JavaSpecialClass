package org.example.Day6.testAccessModifier;

import org.example.Day6.Animal;

public class Cat extends Animal {
    public void display(){
        System.out.println("name: " +super.name);
        System.out.println("age: " +super.age);
    }
    public static void main(String[] args){

    }
}
