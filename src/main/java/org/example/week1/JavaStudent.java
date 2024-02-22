package org.example.week1;

public class JavaStudent extends Student{

    private int numberOfMonths;

    public JavaStudent(String name, int age, String gender, String studentClass, int numberOfMonths) {
        super(name, age, gender, studentClass);
        this.numberOfMonths = numberOfMonths;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }
}
//package org.example.week1;

class StudentTest{
    public static void main(String[] args) {

        Student student1 = new Student("Adebola Jegede", 35, "Male", "Java");
        System.out.println(student1 );
        System.out.println( Student.getNumberOfStudents() );

        Student student2 = new JavaStudent("Donatus Nwigwe", 39, "Male", "Python", 4);
        System.out.println(student2);
        System.out.println( Student.getNumberOfStudents() );

        JavaStudent student3 = (JavaStudent)(new Student("Donatus Nwigwe", 39, "Male", "Python"));
        student3.setNumberOfMonths(4);
        System.out.println( Student.getNumberOfStudents() );


    }
}