package org.example.week1;

public class Student {

    private String name;
    private int age;
    private String gender;
    private String studentClass;

    private static int numberOfStudents;

    //Constructor with 4 arguments to create a Student object
    public Student(String name, int age, String gender, String studentClass) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentClass = studentClass;
        numberOfStudents++;
    }
    public static int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student name: " + getName() + ", Age: " + this.age + ", Gender: " + gender + ", Student Class: " + studentClass;
    }
}


