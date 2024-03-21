package org.example.week5;

import org.example.week2.exercise.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Teacher{ // implements Comparable<Teacher> */

    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Comparing this object's name with the 'teacher' object's name.
//    @Override
//    public int compareTo(Teacher teacher) {
//        return this.getName().compareTo(teacher.getName());
//    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class TeacherTest{
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("David Mike", "Java", 30000);
        Teacher teacher2 = new Teacher("Angela Moore", "Python", 40000);
        Teacher teacher3 = new Teacher("Zainab Aminu", "JavaScript", 50000);
        Teacher teacher4 = new Teacher("Man Woman", "JQuery", 40500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);

        Comparator<Teacher> subjectComparator = (t1, t2) -> t2.getSubject().compareTo(t1.getSubject());

        teacherList.stream().sorted(subjectComparator).forEach(System.out::println);
        System.out.println();

        List<String> stringList = new ArrayList<>();
        stringList.add("James");
        stringList.add("Anayo");
        stringList.add("Rufai");
        stringList.add("Kemi");
        stringList.add("Samuel");
        stringList.add("Kenechukwu");



        Comparator<String> stringComparator = (string1, string2) -> string2.compareTo(string1);
        stringList.stream().sorted().forEach(System.out::println);
        System.out.println();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(20);
        integerList.add(1);
        integerList.add(4);
        integerList.add(2);

        integerList.stream().sorted().forEach(System.out::println);
        System.out.println();

        Supplier<Teacher> teacherSupplier = () -> new Teacher("Susan Shaw", "React", 30000);
        System.out.println(teacherSupplier.get());
        System.out.println();

        //Supplier to supply Random Integers less than 20
        Supplier<Integer> integerSupplier = () -> (int) (Math.random()* 20);

        for( int i = 0; i < 10; i++ ){
            integerList.add(integerSupplier.get());
        }
        integerList.stream().sorted().forEach(System.out::println);
        System.out.println();

        //Consumer created to print Teacher object
        Consumer<Teacher> teacherConsumer = (teach) ->
                System.out.println("Name: " + teach.getName() + ", Subject: " + teach.getSubject() + ", Salary: " + teach.getSalary());

        //Comparator and Consumer being called within a stream; this is done explicitly by the Stream
        teacherList.stream().sorted(subjectComparator).forEach(teacherConsumer);
        System.out.println();
        teacherConsumer.accept(teacher1); //Simple usage of the Consumer; calling the .accept method
        System.out.println()
        ;
        //Predicate to test String by length, Integers and Teacher Objects
        Predicate<String> stringPredicate = st -> st.length() >= 6;
        Predicate<Integer> integerPredicate = integer -> integer >= 8;
        Predicate<Teacher> teacherPredicate = tea -> tea.getSalary() >= 40000;

        //Using the stringPredicate
        stringList.stream().filter(stringPredicate).forEach(System.out::println);
        System.out.println();

        for( String st: stringList ){
            System.out.println(stringPredicate.test(st));
        }

        //Using the integerPredicate
//        Consumer<Integer> integerConsumer = x -> System.out.printf("%d is above or equal to 6", x);
        integerList.stream().filter(integerPredicate).forEach( x -> System.out.printf("%d is above or equal to 8\n", x));
        System.out.println();
        for( Integer x : integerList ){
            if( integerPredicate.test( x )){
                String output = integerPredicate.test(x) ? x + " is greater than or equal to 8" : x + " is less than 8";
                System.out.printf("%s\n", output);
            }
        }
        System.out.println();

        //Using the teacherPredicate
        for( Teacher t: teacherList ) {
            if (teacherPredicate.test(t)) {
                teacherConsumer.accept(t);
            }
        }
        System.out.println();
        teacherList.stream().filter( teacher -> teacher.getSubject().contains("J") ).forEach(teacherConsumer);
        System.out.println();

        Consumer<Teacher> salaryConsumer = samuel -> samuel.setName(samuel.getName().toUpperCase());
        teacherList.stream().filter( teacher -> teacher.getSubject().contains("J") ).forEach(salaryConsumer);
        System.out.println(teacherList);

        BiPredicate<Integer, Integer> biPredicate = (t1, t2) -> t1 % 2==0 && t2 %3 ==0;
        for( int i = 1; i < 30; i++ ){
            if( biPredicate.test(i, (i*3))){
                String output = biPredicate.test(i,(i*3)) ? i + " and " + (i*3) + " is divisible by 2 and 3" : "";
                System.out.printf("%s\n", output);
                continue;
            }
            System.out.println(i + " and " + (i*3) + " is not divisible by 2 and 3");
        }

        BiConsumer<Teacher, Double> biConsumer = (teacher, doubles) -> teacher.setSalary(teacher.getSalary() + doubles);
        for( Teacher t: teacherList ){
            biConsumer.accept(t, 6000.00);
        }
        teacherList.forEach(teacherConsumer);

        System.out.println();

        //Function takes in object T and produces object R
        Function<Student, Teacher> studentTeacherFunction =
                student -> new Teacher(student.getName(), student.getStudentClass(), 25000);

        BiConsumer<Student, Double> doubleBiConsumer = (stud, doubles) -> new Teacher(stud.getName(), stud.getStudentClass(), doubles);

        Student st1 = new Student("Bello Man", 25, "Male", "Java");
        Student st2 = new Student("Bisi Woman", 19, "Male", "JQuery");
        Student st3 = new Student("Buchi Girl", 17, "Male", "JavaScript");
        Student st4 = new Student("Solo Boy", 16, "Male", "React");

        List<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);

        List<Teacher> convertedFromStudentToTeacher = studentArrayList.stream().filter(s -> s.getAge() >= 18)
                .map(studentTeacherFunction).toList();
        System.out.println();


        convertedFromStudentToTeacher.forEach(teacherConsumer);
        System.out.println();

        List<Teacher> studentTeachers = new ArrayList<>();
        for( Student st: studentArrayList ){
            if( st.getAge() >= 18 ){
                Teacher formed = studentTeacherFunction.apply(st);
                studentTeachers.add(formed);
            }
        }
        studentTeachers.forEach(teacherConsumer);
        System.out.println();

        List<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("JavaScript");
        subjects.add("React");
        subjects.add("C++");
        subjects.add("JQuery");
        subjects.add("Java");

        BiFunction<String, String, Teacher> biFunction = (name, subject) -> new Teacher(name, subject, 15000.00);
        for( int i = 0; i < subjects.size(); i++ ){
            String name = stringList.get(i);
            String subject = subjects.get(i);
            Teacher teacher = biFunction.apply(name, subject);
            studentTeachers.add(teacher);
        }

        studentTeachers.forEach(teacherConsumer);

    }
}