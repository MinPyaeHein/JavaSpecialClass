package org.example.Day3.ifConduction;

public class IfConduction {
    public static void main(String[] args) {

        int mark = 70;
        if (90 <= mark && mark<=100) {
            System.out.println("You are passed with A");
        } else if (80 <= mark && mark<90) {
            System.out.println("You are passed A-");
        }else if (70 <= mark && mark<80) {
            System.out.println("You are passed with B");
        } else if (60 <= mark && mark<70) {
            System.out.println("You are passed B-");
        } else if (50 <= mark && mark<60) {
            System.out.println("You are passed with C");
        } else {
            System.out.println("You are passed with C-");
        }
        int wather = 31;
        switch (wather){
            case 40:
                System.out.println("It's very hot");
                break;
            case 30:
                System.out.println("It's hot");
                break;
            case 20:
                System.out.println("It's normal");
                break;
            case 10:
                System.out.println("It's cold");
                break;
            default:
                System.out.println("It's very cold");

        }
        String name="Min66";
        switch (name){
            case "Ahmed":
                System.out.println("Hello Ahmed");
                break;
            case "Min":
                System.out.println("Hello Min");
                break;
            default:
                System.out.println("Hello Unknown");
        }

    }
    }
