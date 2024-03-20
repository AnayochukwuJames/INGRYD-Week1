package org.example.week2.exercise;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String course;
    private String department;
    private int score;
    private char grade;

    public Student(String firstName, String lastName, int age, String course, String department, int score, char grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.department = department;
        this.score = score;
        this.grade = grade;
    }

    public Student(String belloMan, int i, String male, String java) {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student student = new Student("james","Anayo",7,"Java","ICT",90, 'A');
        }

    public String getName() {
        return null;
    }

    public String getStudentClass() {
        return null;
    }
}
