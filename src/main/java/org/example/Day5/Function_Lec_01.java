package org.example.Day5;

import java.util.Scanner;

public class Function_Lec_01 {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the number of sets for Leg Exercise: ");
   int set=scanner.nextInt();
   System.out.println("Enter the number of reps for Leg Exercise: ");
   int rep=scanner.nextInt();
   Boolean result=legExercise(set,rep);

   if(result){
       System.out.println("Leg Exercise Completed----->Congratulation Completed");
   }else{
       System.out.println("Leg Exercise Not Completed----->Try Again");
   }
    }

    public static boolean legExercise(int set,int rep){
        System.out.println("<<<<Starting Leg Exercise>>>>");
            legExtension(set,rep);
            lunges(set,rep);
            legPress(set,rep);
            squat(set,rep);
        return true;
    }
    public static Boolean legExtension(int set,int rep) {
        while (set > 0) {
            while (rep > 0) {
                System.out.println("Leg Extension Count=" + rep);
                rep--;
            }
            set--;
        }

     return true;
    }
    public static Boolean lunges(int set,int rep) {
        while (set > 0) {
            while (rep > 0) {
                System.out.println("Lunges Count=" + rep);
                rep--;
            }
            set--;
        }

     return true;
    }
    public static Boolean legPress(int set,int rep){
        while (set > 0) {
            while (rep > 0) {
                System.out.println("Leg Press Count=" + rep);
                rep--;
            }
            set--;
        }
        return true;
    }
    public static Boolean squat(int set,int rep){
        while (set > 0) {
            while (rep > 0) {
                System.out.println("squat Count=" + rep);
                rep--;
            }
            set--;
        }
        System.out.println("!!Finished Squat!!!" );
        return true;
    }


}
