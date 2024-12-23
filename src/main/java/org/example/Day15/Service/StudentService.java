package org.example.Day15.Service;

import org.example.Day10.Student;
import org.example.Day15.Util.DataUtail;

public class StudentService {
    public void studentManagement(){
        boolean flag = true;
        do{
            System.out.println("Welcome to Student Management System");
            System.out.println("Choose your option: ");
            System.out.println( "1. Register Student \n" +
                    "2. Delete Student \n" +
                    "3. Update Student \n" +
                    "4. Display All Students \n" +
                    "5. Exit");
            int choice = DataUtail.scanner.nextInt();DataUtail.scanner.nextLine();
            switch (choice) {
                case 1:
                   studentRegister();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }while(flag);

    }
    public void studentRegister(){
        System.out.println("Welcome Student Registration Process");
        boolean flag=true;
        do{
            Student student = getStudentInformation();
            Student.addStudent(student);
            System.out.println("Student Info: " + student);
            System.out.println("Do you want to add more student? (yes/no)");
            String answer = DataUtail.scanner.nextLine();
            if(answer.equalsIgnoreCase("no")){
                flag=false;
            }

        }while(flag);
    }
    public void deleteStudent(){
        System.out.println("Delete student Process");
        System.out.println("Enter Student Name that you want to delete::");
        String name = DataUtail.scanner.nextLine();
        Student student = Student.getStudentByName(name);
        if(student!=null){

        }else{
            System.out.println("Student not found...!!!");
        }
    }
    public void updateStudent(){
        System.out.println("Welcome to Student Update Process");
    }
    public static void displayAllStudents() {
        System.out.println("!!....Display All Students....!! ");
        for (int i = 0; i < Student.totalStudentCount; i++) {
            Student student = Student.getStudents()[i];
            System.out.println(student);
        }
    }
    public Student getStudentInformation() {
        System.out.println("Enter Student Name: ");
        String name = DataUtail.scanner.nextLine();
        System.out.println("Enter Student Age: ");
        int age = DataUtail.scanner.nextInt();DataUtail.scanner.nextLine();
        System.out.println("Enter Student Phone: ");
        String phone = DataUtail.scanner.nextLine();
        Student student = new Student(name, age, phone);
        return student;
    }
}
