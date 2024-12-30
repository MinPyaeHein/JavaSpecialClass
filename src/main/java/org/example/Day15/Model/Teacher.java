package org.example.Day15.Model;

public class Teacher extends People{
    public static final int MAX_TEACHERS = 10000;
    private static Teacher[] teachers = new Teacher[MAX_TEACHERS];
    private String department;
    private String position;
    private String address;
    private String subject;
    private static int totalTeacherCount=0;

    public Teacher(String name, int age, String phone, String department, String position, String address, String subject) {
        this.setName(name);
        this.setAge(age);
        this.setPhone(phone);
        this.department = department;
        this.position = position;
        this.address = address;
        this.subject = subject;
    }
    public static void addTeacher(Teacher teacher) {
        Teacher.teachers[totalTeacherCount] = teacher;
        totalTeacherCount++;
    }
    public static Teacher getTeacherByName(String studentName) {
        for (int i = 0; i < totalTeacherCount; i++) {
            if (teachers[i].getName().equals(studentName)) {
                return teachers[i];
            }
        }
        return null;
    }
    public static void delete(Teacher teacher) {
        for (int i = 0; i < totalTeacherCount; i++) {
            if (teachers[i] == teacher) {
                for (int j = i; j < totalTeacherCount-1; j++) {
                    teachers[j] = teachers[j+1];
                }
                teachers[totalTeacherCount-1] = null;
                totalTeacherCount--;
                break;
            } }}

    public static Teacher[] getTeachers() {
        return teachers;
    }

    public static void setTeachers(Teacher[] teachers) {
        Teacher.teachers = teachers;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static int getTotalTeacherCount() {
        return totalTeacherCount;
    }

    public static void setTotalTeacherCount(int totalTeacherCount) {
        Teacher.totalTeacherCount = totalTeacherCount;
    }
}
