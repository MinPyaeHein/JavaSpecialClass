package org.example.Day3.Scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        //String to integer
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("You entered: " + a);

        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println("You entered: " + s);

        System.out.println("Enter a double: ");
        double k =Double.parseDouble(scanner.nextLine());
        System.out.println("You entered double: " + k);

        System.out.println("Enter a string another time: ");
        String j = scanner.nextLine();
        System.out.println("You entered: " + j);
    }
}
