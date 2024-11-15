package org.example.Day7;

import org.example.Day7.instanceVariable.Animal;
import org.example.Day7.instanceVariable.ClassRoom;

public class MainApp {
    public static void main(String[] args) {
        //instantiate
               Animal animal = new Animal();
               animal.count+=1;
               animal.name = "Lion";
               animal.age = "5";
               animal.type = "Mammal";
               animal.display();
       //instantiate
            Animal animal1 = new Animal();
            animal1.count+=1;
            animal1.name = "Cat";
            animal1.age = "12";
            animal1.type = "Mammal";
            animal1.display();

        ClassRoom classRoom = new ClassRoom("C101",
                "Class Room 101",
                40,
                "ABC Building",
                "5th Floor",
                "ABC Organization",
                "ABC Faculty");

        ClassRoom classRoom1 = new ClassRoom("C102",
                "Class Room 102",
                30, "XYZ Building",
                "3rd Floor",
                "XYZ Organization",
                "XYZ faculty");

        System.out.println(classRoom);
        System.out.println(classRoom1);

        ClassRoom classRoom2 = new ClassRoom();

        ClassRoom classRoom3 = new ClassRoom(
                "C103",
                "Class Room 103",
                50,
                "2nd Floor",
                "DEF Faculty"
        );

        ClassRoom classRoom4 = new ClassRoom();

        classRoom4.setRoomName("Class Room 104");
    }
}
