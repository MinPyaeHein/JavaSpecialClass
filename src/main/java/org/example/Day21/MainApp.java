package org.example.Day21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    private static Scanner scanner = new Scanner(System.in);
    public static Date convertStringToDate(String dateStr)  {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formatter.parse(dateStr);
        } catch (ParseException e) {
           return null;
        }
    }
    public static Date enterDateData(){
        System.out.println("Enter vehicle Date(dd/MM/yyyy): ");
        String dateStr = scanner.nextLine();
        Date vehicleProductionDate=convertStringToDate(dateStr);;
        while (vehicleProductionDate==null){
            System.out.println("Please Enter Valid date format");
            System.out.println("Enter vehicle Date(dd/MM/yyyy): ");
            dateStr = scanner.nextLine();
            vehicleProductionDate = convertStringToDate(dateStr);
        }
        return vehicleProductionDate;
    }

    public static int catchingInteger(){
        System.out.println("Enter vehicle No of vehicle");
        int vehicleNumberOfVehicles =-1;
        try{
            vehicleNumberOfVehicles = scanner.nextInt();
            return vehicleNumberOfVehicles;
        }catch(InputMismatchException j){
            scanner.nextLine();
            System.out.println("Please Enter Integer");
            return -1;
        }
    }
    public static int getVehicleNumberOfVehicles(){
        int number=catchingInteger();
        while (number==-1){
            number=catchingInteger();
        }
        return number;
    }


    public static Vehicle getVehicleInfo(){

        System.out.println("Enter vehicle information:");
        System.out.println("Enter vehicle name: ");
        String vehicleName = scanner.nextLine();
        System.out.println("Enter vehicle licen: ");
        String vehicleLicen = scanner.nextLine();
        System.out.println("Enter vehicle color: ");
        String vehicleColor = scanner.nextLine();
        System.out.println("Enter vehicle model: ");


        String vehicleModel = scanner.nextLine();
        Date vehicleProductionDate = enterDateData();


        int vehicleNumberOfVehicles = getVehicleNumberOfVehicles();



        String vehicleOwnerEmail = scanner.nextLine();
        return new Vehicle(vehicleName, vehicleLicen, vehicleColor, vehicleModel, vehicleProductionDate, vehicleNumberOfVehicles, vehicleOwnerEmail);

    }

    public static void main(String[] args) throws ParseException {
        Vehicle vehicle = getVehicleInfo();
        System.out.println(vehicle);
    }
}
