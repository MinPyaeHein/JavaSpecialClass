package org.example.Day15.Service;

import org.example.Day15.Model.Student;
import org.example.Day15.Model.Teacher;
import org.example.Day15.Util.DataUtail;

public class TeacherService {
    public  void teacherManagement(){
        boolean flag = true;
        do{
            System.out.println("Welcome to Teacher Management System");
            System.out.println("Choose your option: ");
            System.out.println( "1. Register Teacher \n" +
                    "2. Delete Teacher \n" +
                    "3. Update Teacher \n" +
                    "4. Display All Teacher \n" +
                    "5. Exit");
            int choice = DataUtail.scanner.nextInt();DataUtail.scanner.nextLine();
            switch (choice) {
                case 1:
                    teacherRegister();
                    break;
                case 2:
                    deleteTeacher();
                    break;
                case 3:
                    updateTeacher();
                    break;
                case 4:
                    displayAllTeachers();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }while(flag);
    }
    public void teacherRegister(){
        System.out.println("Welcome Teacher Registration Process");
        boolean flag=true;
        do{
            Teacher teacher = getTeacherInformation();
            Teacher.addTeacher(teacher);
            System.out.println("Teacher Info: " + teacher);
            System.out.println("Do you want to add more teacher? (yes/no)");
            String answer = DataUtail.scanner.nextLine();
            if(answer.equalsIgnoreCase("no")){
                flag=false;
            }

        }while(flag);
    }
    public  void deleteTeacher() {
        System.out.println("Delete Teacher Process");
        System.out.println("Enter the name of the Teacher you want to delete:");
        String name = DataUtail.scanner.nextLine();
        Teacher teacher = Teacher.getTeacherByName(name);
        if (teacher != null) {
            System.out.println("Are you sure you want to delete the teacher information? (yes/no)");
            System.out.println(teacher);
            String confirmation = DataUtail.scanner.nextLine();
            if (confirmation.equalsIgnoreCase("yes")) {
                Teacher.delete(teacher);
                System.out.println("Techer deleted successfully.");
            } else { System.out.println("Deletion cancelled.");  }
        } else { System.out.println("Teacher not found!"); }
    }

    public void updateTeacher(){
        System.out.println("Welcome to Student Update Process");
        System.out.println("Enter Student Name that you want to update::");
        String name=DataUtail.scanner.nextLine();
        Student student= Student.getStudentByName(name);
        if(student==null){
            System.out.println("Student not found...!!!");
        }else{
            Teacher newTeacher=getTeacherInformation();
            student.setName(newTeacher.getName());
            student.setAge(newTeacher.getAge());
            student.setPhone(newTeacher.getPhone());    }
    }
    public void displayAllTeachers() {
        System.out.println("!!....Display All Teachers....!! ");
        for (int i = 0; i < Teacher.getTotalTeacherCount(); i++) {
            Teacher teacher = Teacher.getTeachers()[i];
            System.out.println(teacher);
        }
    }
    public  Teacher getTeacherInformation() {
        System.out.println("Enter Teacher Name: ");
        String name = DataUtail.scanner.nextLine();
        System.out.println("Enter Teacher Age: ");
        int age = DataUtail.scanner.nextInt();DataUtail.scanner.nextLine();
        System.out.println("Enter Teacher Phone: ");
        String phone = DataUtail.scanner.nextLine();
        System.out.println("Enter Teacher Department: ");
        String department = DataUtail.scanner.nextLine();
        System.out.println("Enter Teacher Position: ");
        String position = DataUtail.scanner.nextLine();
        System.out.println("Enter Teacher Address: ");
        String  address= DataUtail.scanner.nextLine();
        System.out.println("Enter Teacher Subject: ");
        String  subject= DataUtail.scanner.nextLine();
        Teacher teacher = new Teacher(name, age, phone, department, position, address, subject);
        return teacher;
    }
}
