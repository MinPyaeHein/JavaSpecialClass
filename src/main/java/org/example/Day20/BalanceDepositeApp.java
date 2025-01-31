package org.example.Day20;

import java.util.Scanner;

public class BalanceDepositeApp {
    public static int currentBalance = 1000;
    public static void main(String[] args) {
        try{
            balanceDepositor();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Current Balance: " + currentBalance); // Output: 1300
    }
    public static void  balanceDepositor(){
        Scanner scanner = new Scanner(System.in);
        int ammount=scanner.nextInt();
        if(ammount<0){
            throw new BalanceExceptions("Amount can not be negative!!");
        }
        currentBalance+=ammount;
    }
}
