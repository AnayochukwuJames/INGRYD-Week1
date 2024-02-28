package org.example.week3;

public class ThisDemo {
    private String firstName;
    private String lastName;
    private int age;
    private String location;
    private double balance;

    @Override
    public String toString() {
        return "ThisDemo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", balance=" + balance +
                '}';
    }

    public ThisDemo(String firstName, String lastName, int age, String location, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
        this.balance = balance;
    }

    public ThisDemo(String firstName, String lastName, int age, String location) {
        this(firstName, lastName, age, location, 0.0);
    }

    public ThisDemo(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "Nigeria");
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}