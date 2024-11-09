package org.example.Day3.Method;

public class Method0 {
    public static void main(String[] args) {
        greeting();
        greeting();
        greeting();

        greetingWithName("Aung Khant");
        greetingWithName("Wai Yan");

        greetingWithNameAndAge("Aung Khant",23);
    }
    public static void greeting(){
        System.out.println("Welcome From My World!!");
    }
    public static void greetingWithName(String name){
        System.out.println("Welcome From My World!! "+name);
    }

    public static void greetingWithNameAndAge(String name, int age){
        System.out.println("Welcome From My World!! "+name+" (Age: "+age+")");
    }


}
