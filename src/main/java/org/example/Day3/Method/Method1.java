package org.example.Day3.Method;

public class Method1 {

    public static void add(int num1,int num2){
        System.out.println("add two numebrs:"+(num1+num2));
    }
    public static int addReturn(int num1,int num2){
        int total=num1+num2;
        System.out.println("add two numbers and return:"+(total));
        return total;

    }

    public static void main(String[] args) {
        add(2,3);
        int num=addReturn(4,5);
        System.out.println("addReturn two numbers:"+num);
    }
}
