package org.example.week1;

public class GraduateStudents extends Student {

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
        GraduateStudents graduateStudents = (GraduateStudents)(new Student("Man", 32, "Male", "Beginners"));

        Student student = new GraduateStudents("Boy", 22, "Female", "Starter", "How to Ride a horse",
                "Prof. Sahalu");
    }
}