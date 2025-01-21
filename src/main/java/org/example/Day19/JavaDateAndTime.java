package org.example.Day19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateAndTime {
    public static void main(String[] args) throws ParseException {
        String format="dd/MM/yyyy";
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date date1 = new Date();
        Date date2 = formatter.parse("01/01/2020");

        System.out.println("Difference in milliseconds: " + (date2.getTime() - date1.getTime()));
        System.out.println("Difference in days: " + ((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24)));
        System.out.println("Difference in years: " + (((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24 ))/ 30));
        System.out.println("Current date1 and time: " + date1.toLocaleString());
        System.out.println("Current date2 and time: " + date2.toLocaleString());
        System.out.println("Current date and time in " + format + " format: " + formatter.format(date1));
        System.out.println();
    }
}
