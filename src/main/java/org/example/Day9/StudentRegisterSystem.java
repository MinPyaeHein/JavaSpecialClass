package org.example.Day9;

import java.util.Scanner;

public class StudentRegisterSystem {
    public static Student getStudentInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Student Age: ");
        int age = scanner.nextInt();scanner.nextLine();
        System.out.println("Enter Student Phone: ");
        String phone = scanner.nextLine();
        Student student = new Student(name, age, phone);
        return student;
    }
    public static void main(String[] args) {
        Student student=getStudentInformation(); // getStudent
        student.display();
    }
}
