package org.example.Day18;

public class Factorial {
    public static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }else{
            System.out.println("Factorial of "+num+"*factorial("+(num-1)+")");
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
       System.out.println("Factorial of 6 is: "+factorial(6)) ;
    }

}
