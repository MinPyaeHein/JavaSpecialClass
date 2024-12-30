package org.example.Day16;

public class People {
    private int id;
    private String name;
    private String email;
    private String nrc;
    private int age;
    private String address;
    private String phone;
    public People(){
        System.out.println("Constructor People Object Created-->");
    }
    public People(int id, String name, String email, String nrc, int age, String address, String phone) {
        System.out.println("Constructor People Parameterlized-->");
        this.id = id;
        this.name = name;
        this.email = email;
        this.nrc = nrc;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
