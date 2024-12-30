package org.example.Day15.Model;

public class Student extends People{
    public static final int MAX_STUDENTS = 10000;
    public static int totalStudentCount = 0;
    private static Student[] students = new Student[MAX_STUDENTS];
    public Student(String name, int age, String phone) {
        this.setName(name);
        this.setAge(age);
        this.setPhone(phone);
    }

    public static Student[] getStudents() {
        return students;
    }
    public static void setStudents(Student[] students) {
        Student.students = students;
    }
    public static void addStudent(Student student) {
        Student.students[totalStudentCount] = student;
        totalStudentCount++;
    }

    public static Student getStudentByName(String studentName) {
        for (int i = 0; i < totalStudentCount; i++) {
            if (students[i].getName().equals(studentName)) {
                return students[i];
            }
        }
        return null;
    }
    public static void delete(Student student) {
        for (int i = 0; i < totalStudentCount; i++) {
            if (students[i] == student) {
                for (int j = i; j < totalStudentCount-1; j++) {
                    students[j] = students[j+1];
                }
                students[totalStudentCount-1] = null;
                totalStudentCount--;
                break;
            } }}

}
