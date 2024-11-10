package org.example.Day1;

import org.example.Day6.AccessModifier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String name_p1="Min";
    String name_p2="Khank";
    String name_p3="Toe";

    int age_p1=70;
    int age_p2=50;
    int age_p3=70;


    Person person1 = new Person();
    person1.name="Min";
    person1.age=13;
    person1.address="Dawei";
    person1.city="Yango";

    Person person2 = new Person();
    person2.name="Khant";
    person2.age=20;
    person2.address="Yangon";
    person2.city="Yango";

    Person person3 = new Person();
    person3.name="Toe";
    person3.age=19;
    person3.address="Bago";
    person3.city="Yango";

    System.out.println("name::"+person1.name+"age::"+person1.age+"address::"+person1.address+"city::"+person1.city);
    System.out.println("name::"+person2.name+"age::"+person2.age+"address::"+person2.address+"city::"+person2.city);
    System.out.println("name::"+person3.name+"age::"+person3.age+"address::"+person3.address+"city::"+person3.city);
        AccessModifier access = new AccessModifier();
       access.display();
    }
}