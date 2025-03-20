package org.example.Day16;

public class Student extends People{
    private double gpa;
    public Student(){
        System.out.println("Constructor Student Object Created-->");
    }

    public Student(String name){
        System.out.println("Constructor Student Name---> " + name);
        this.setName(name);
    }
    public Student(int id,String name, double gpa,String nrc,String email,String address ,int age, String phone){
        System.out.println("<-------Five arguments Constructor----->");
//        super( id,  name,  email,  nrc,  age,  address,  phone);
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
