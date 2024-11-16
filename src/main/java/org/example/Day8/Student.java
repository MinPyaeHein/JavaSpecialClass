package org.example.Day8;

public class Student {
    private String name;
    private int age;
    public static int totalStudntCount=0;
    public Student(String name, int age) {
        this.name = name;
        if(age<18 || age>30){
            throw new IllegalArgumentException("Age should be between 18 and 30");
        }
        this.age = age;
        totalStudntCount++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<18 || age>30){
            throw new IllegalArgumentException("Age should be between 18 and 30");
        }
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
