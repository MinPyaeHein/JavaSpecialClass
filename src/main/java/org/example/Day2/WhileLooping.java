package org.example.Day2;

public class WhileLooping {

    public static void main(String[] args) {
    int count=5;
    while(count>0){
        System.out.println("Hello World");
//        count=count-1;
        count--;
    }

    int count1=0;
    while(count1<5){
        System.out.println("Hello World 1");
        count1++;
    }
    int count3=0;
    do{
        System.out.println("Hello World "+count3);
        count3--;
    }while(count3>0);
}}
