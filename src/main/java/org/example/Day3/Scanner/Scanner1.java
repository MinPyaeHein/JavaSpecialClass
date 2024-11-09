package org.example.Day3.Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = scanner.nextInt(); scanner.nextLine();
        System.out.println("You entered: " + a);

        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println("You entered: " + s);

        System.out.println("Enter a string another time: ");
        int k = scanner.nextInt();scanner.nextLine();
        System.out.println("You entered: " + k);

        System.out.println("Enter a string another time: ");
        String j = scanner.nextLine();
        System.out.println("You entered: " + j);
    }
}
