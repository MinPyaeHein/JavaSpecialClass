package org.example.Day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHlanding {
    public static void main(String[] args) {
      int[] arr = new int[4];
      Scanner scanner = new Scanner(System.in);
        //instruction 1
        System.out.println("Enter Name:");
        String name=scanner.nextLine();
        System.out.println("name is "+name);

        //instruction 2
        System.out.println("Enter Age:");
        try{
          int age= scanner.nextInt(); scanner.nextLine();
          int ans = 10 / age;
          arr[4]=age;
          System.out.println("age is "+age);
        }catch(RuntimeException e){
          System.out.println("error is occurs !!!"+e.getMessage());
        }
        //instruction 3
        System.out.println("Enter Phone:");
        String phone= scanner.nextLine();
        System.out.println("phone is "+phone);

        //instruction 4
        System.out.println("Enter Price:");
        Double price= scanner.nextDouble();
        System.out.println("Price is "+price);


    }
}
