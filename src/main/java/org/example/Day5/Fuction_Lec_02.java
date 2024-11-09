package org.example.Day5;

import java.util.Scanner;

public class Fuction_Lec_02 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DeliveryInformation deliveryInformation=getDeliveryInformation();
        boolean response=processOfDelivery(deliveryInformation);
        if(response){
            System.out.println("Well Done Delivery!!--->thank you");
        }else{
            System.out.println("Something went wrong!!--->try again");
        }

    }
    public static DeliveryInformation getDeliveryInformation(){
        DeliveryInformation deliveryInformation = new DeliveryInformation();
        System.out.println("Enter Order Id: ");
        deliveryInformation.orderId = scanner.nextLine();
        System.out.println("Enter Name: ");
        deliveryInformation.name = scanner.nextLine();
        System.out.println("Enter Address: ");
        deliveryInformation.address = scanner.nextLine();
        System.out.println("Enter Content Address: ");
        deliveryInformation.contentAddress = scanner.nextLine();
        System.out.println("Enter Delivery DateTime: ");
        deliveryInformation.deliveryDateTime = scanner.nextLine();
        return deliveryInformation;

    }
    public static boolean processOfDelivery(DeliveryInformation deliveryInformation){
        if(deliveryInformation.orderId.equals("")
                ||deliveryInformation.name.equals("")
                || deliveryInformation.address.equals("")
                || deliveryInformation.contentAddress.equals("")
                || deliveryInformation.deliveryDateTime.equals("")){
            return false;
        }
        System.out.println("Process of Delivery Information Completed");
        System.out.println("Process of Delivery Process is Complete");
        return true;
    }

    public static class DeliveryInformation{
           String orderId;
           String name;
           String address;
           String contentAddress;
           String deliveryDateTime;
    }
}

