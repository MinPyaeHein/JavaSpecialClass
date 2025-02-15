package org.example.Day16;

public class Teacher extends People{
    private String subject;
    private String position;
    private String department;

    public Teacher(int id, String name, String email, String nrc, int age, String address, String phone, String subject, String position, String department) {
        super(id, name, email, nrc, age, address, phone);
        this.subject = subject;
        this.position = position;
        this.department = department;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
