package org.example.Day22;

public class MainApp {
    private static BookService bookService;
    public static void main(String[] args) {

        Book book=bookService.bookRegistration();
        System.out.println(book);

    }


}
