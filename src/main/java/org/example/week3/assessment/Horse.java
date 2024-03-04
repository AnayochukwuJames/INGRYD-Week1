package org.example.week3.assessment;

public class Horse extends LivingThings{
    public Horse(String name, int age) {
        super(name, age);
    }
    @Override
    public void speak() {
        System.out.println("Can Horse speak");
    }
    @Override
    public void sleep() {
        System.out.println("Horse can sleep");
    }
    @Override
    public void move() {
        System.out.println("Horse can move");
    }
    @Override
    public void eat() {
        System.out.println("Horse eat");

    }
}
