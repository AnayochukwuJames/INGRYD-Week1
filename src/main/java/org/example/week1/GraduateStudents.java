package org.example.week1;

public class GraduateStudents extends Student1 {

    String thesis;
    String supervisorName;

    public GraduateStudents(String name, int age, String gender, String studentClass, String thesis, String supervisorName) {
        super(name, age, gender, studentClass);
        this.thesis = thesis;
        this.supervisorName = supervisorName;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public static void main(String[] args) {
        GraduateStudents graduateStudents = (GraduateStudents)(new Student1("Man", 32, "Male", "Beginners"));

        Student1 student1 = new GraduateStudents("Boy", 22, "Female", "Starter", "How to Ride a horse",
                "Prof. Sahalu");
    }
}