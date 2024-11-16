package org.example.Day8;

import java.util.Arrays;

public class ArryInJava {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The length of the array is: " + arr.length);
        System.out.println("Index 0:---> " + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

        int[] nums=new int[6];
        nums[2]=3;
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

       char y='c';

        int c='c';
        System.out.println(c);
        Student student=new Student("Felix",20);
        Student student1=new Student("Wai Yan",21);
        Student student2=new Student("Aung Khant",22);

        Student[] students=new Student[Student.totalStudntCount];
        students[0]=student;
        students[1]=student1;
        students[2]=student2;
        for (Student stu : students) {
            System.out.println(stu);
        }


    }
}
