package org.example.Day22;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int qty;
    private int price;
    private String email;
    private String phone;

    public Book() {
        System.out.println("Call Default Constructor");
    }

    public Book(String title, String author, int pages, int qty, int price, String email,String phone) {
        System.out.println("Call Parameters Constructor");
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.qty = qty;
        this.price = price;
        this.email = email;
        this.phone=phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", qty=" + qty +
                ", price=" + price +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
