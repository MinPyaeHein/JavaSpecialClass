package org.example.Day20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeToeToe {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(ft.format(date));//Convert Date to String
        Date birthDate=null;
        try{
            String birthDateStr = "23/02-1999";
            birthDate=ft.parse(birthDateStr);//Convert String to Date
            System.out.println("Difference in milliseconds: " + (date.getTime() - birthDate.getTime()));// Time difference
            System.out.println("Difference in days: " + ((date.getTime() - birthDate.getTime()) / (1000 * 60 * 60 * 24))); //Days difference
            System.out.println("Difference in years: " + (((date.getTime() - birthDate.getTime()) / (1000 * 60 * 60 * 24 ))/ 365));// years difference
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }





    }
}
