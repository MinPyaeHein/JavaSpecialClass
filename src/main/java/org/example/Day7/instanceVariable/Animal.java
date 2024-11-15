package org.example.Day7.instanceVariable;

public class Animal {
    public String name;
    public String age;
    public String type;
    public int count=0;
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        System.out.println("Count: " + count);
    }
}
