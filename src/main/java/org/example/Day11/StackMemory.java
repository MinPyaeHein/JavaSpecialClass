package org.example.Day11;

public class StackMemory {
    public static void main(String[] args){
        Student student = new Student("Ni Ni",6,"63636");
        Student student1 = new Student("Zin Zin",6,"63636");

       Student[] students = new Student[3];
       students[0] = student;
       students[1] = student1;
    }
}
