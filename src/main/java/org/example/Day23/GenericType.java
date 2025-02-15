package org.example.Day23;

import org.example.Day10.Student;
import org.example.Day16.Teacher;

import java.util.ArrayList;
import java.util.List;

public class GenericType {
    public static void main(String[] args) throws Exception {
        CustomArrayListGeneric<String> stringArrayList = new CustomArrayListGeneric<>();
        CustomArrayListGeneric<Student> studentArrayList = new CustomArrayListGeneric<>();
        CustomArrayListGeneric<Teacher> teacherArrayList = new CustomArrayListGeneric<>();
        teacherArrayList.add(new Teacher(1, "Min Pyae Hein", "minpyaehein", "12345", 3, "minpyaehein", "12345", "Math", "Teacher", "Science"));
        teacherArrayList.add(new Teacher(2, "Min Pyae Hein", "minpyaehein", "12345", 3, "minpyaehein", "12345", "Math", "Teacher", "Science"));
        teacherArrayList.add(new Teacher(3, "Min Pyae Hein", "minpyaehein", "12345", 3, "minpyaehein", "12345", "Math", "Teacher", "Science"));
         Teacher teacher=teacherArrayList.getObjectByIndex(1);

         List<Teacher> teachers=new ArrayList<>();
         Teacher teacher1=new Teacher(1, "Min Pyae Hein", "minpyaehein", "12345", 3, "minpyaehein", "12345", "Math", "Teacher", "Science");
         teachers.add(teacher1);
         System.out.println("teacheres " + teachers.size());
         teachers.remove(teacher1);
         System.out.println("teacheres " + teachers.size());

         System.out.println(teacher);
    }
}
