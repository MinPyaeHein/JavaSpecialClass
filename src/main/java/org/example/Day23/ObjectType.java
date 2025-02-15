package org.example.Day23;

import org.example.Day8.Student;

public class ObjectType {

    public static void main(String[] args){

        CustomArrayListObject customArrayList = new CustomArrayListObject();
        customArrayList.add(10);
        customArrayList.add("Min Pyae Hein");
        customArrayList.add("Mg Mg");
        customArrayList.add(true);
        customArrayList.add(10.5);
        customArrayList.add(new Student("Min Pyae Hein",20));
        customArrayList.display();
        //////////Get By Index///////
        System.out.println("//////////Get By Index///////");
        int obj1=(Integer)customArrayList.getObjectByIndex(0);
        double obj2=(Double)customArrayList.getObjectByIndex(4);
        Student obj3=(Student)customArrayList.getObjectByIndex(5);
        double total=obj1+obj2;
        System.out.println("total==>"+total);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3.getName());



    }
}
