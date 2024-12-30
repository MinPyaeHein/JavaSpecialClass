package org.example.Day15;
import org.example.Day10.Student;
import org.example.Day15.Service.StudentService;
import org.example.Day15.Service.TeacherService;
import org.example.Day15.Util.DataUtail;

import java.util.Scanner;

public class MainApp {
    private StudentService studentService;
    private TeacherService teacherService;
   public MainApp() {
       this.studentService = new StudentService();
       this.teacherService = new TeacherService();
   }
    public static void main(String[] args) {
        String master=null;
       do{
           MainApp mainApp = new MainApp();
           System.out.println("Welcome to School Management System");
           System.out.println("1. Student Management " );
           System.out.println("2. Teacher Management " );
           System.out.println("3. Exit " );
           master=DataUtail.scanner.nextLine();
           switch (master) {
               case "1":
                   mainApp.studentService.studentManagement();
                   break;
               case "2":
                   mainApp.teacherService.teacherManagement();
                   break;
               case "3":
                   System.out.println("Exiting...");
                   break;
               default:
                   System.out.println("Invalid Option...!!!");
                   break;
           }
           }while(!master.equals("3"));




    }

}
