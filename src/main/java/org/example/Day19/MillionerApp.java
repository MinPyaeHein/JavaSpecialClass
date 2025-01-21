package org.example.Day19;

public class MillionerApp {
    public static int findMillions(int amount){
        if(amount>=100000){
            return amount;
        }else{
            return findMillions(amount+10);
        }

    }
    public static void main(String[] args){
        int amount = 10;
        int millions = findMillions(amount);
        System.out.println("The millioner is: " + millions);
    }
}
/*
findMillions(15);
  findMillions(20);
     findMillions(25);
       findMillions(30);---------

 */