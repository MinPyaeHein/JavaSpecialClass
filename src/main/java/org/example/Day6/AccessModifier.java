package org.example.Day6;

public class AccessModifier {
    String name="MIn";
    public void display(){
        System.out.println("Name: "+name);
    }

    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        am.display();
    }
}

