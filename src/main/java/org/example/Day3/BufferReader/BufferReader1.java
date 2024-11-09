package org.example.Day3.BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name=br.readLine();
        System.out.println("Hello, "+name);

        System.out.println("Enter your age:");
        String ageString=br.readLine();
        int age=Integer.parseInt(ageString);
        System.out.println("Your age is "+age);
    }
}
