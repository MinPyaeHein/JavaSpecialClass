package org.example.Day22;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookService {
    private static Scanner scanner = new Scanner(System.in);

    public static Book bookRegistration(){
        Book book=null;
        while(true){
            try{
                book=getBookData();
                return book;
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static Book getBookData(){
        try {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter book author: ");
            String author = scanner.nextLine();
            System.out.print("Enter book pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter book qty: ");
            int qty = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter book price: ");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter book email: ");
            String email = scanner.nextLine();
            System.out.print("Enter book phone: ");
            String phone = scanner.nextLine();
            Book book= new Book(title,author,pages,qty,price,email,phone);
            validateBook(book);
            return book;
        }catch(NumberFormatException e){
            throw new NumberFormatException("Invalid input. Please try again.");
        }
    }

    public static void validateBook(Book book) {
        String errors="";
        if(book.getTitle().isEmpty()) {
           errors+="Title is required!!\n";
        }
        if(book.getAuthor().isEmpty()) {
            errors+="Author is required!!\n";
        }
        if(book.getPages() <= 0) {
            errors+="Pages must be greater than 0\n";
        }
        if(book.getQty() <= 0) {
            errors+="Quantity must be greater than 0\n";
        }
        if(book.getPrice() <= 0) {
            errors+="Price must be greater than 0\n";
        }
        if(book.getEmail().isEmpty()) {
            errors+="Email is required!!\n";
        }
        if(!book.getEmail().isEmpty()&&!emailFormatValidation(book.getEmail())) {
            errors+="Email format is invalid!!\n";
        }
        if(book.getPhone().isEmpty()) {
            errors+="Phone is required!!\n";
        }
        if(!book.getPhone().isEmpty()&&!phoneFormatValidation(book.getPhone())) {
            errors+="Email format is invalid!!\n";
        }
        if(errors!=null){
            throw new IllegalArgumentException(errors);
        }


    }

    public static boolean emailFormatValidation(String email){
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean phoneFormatValidation(String phone){
        String phoneRegex = "^\\d{7}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

}
