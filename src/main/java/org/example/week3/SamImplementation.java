package org.example.week3;

public class SamImplementation implements Sam {

    @Override
    public double addition(double first, double second) {
        return first + second;
    }

    @Override
    public double subtraction(double first, double second) {
        return first - second;
    }

    @Override
    public double multiplication(double first, double second) {
        return first * second;
    }

    @Override
    public double division(double first, double second) {
        return first / second;
    }

    public static void display(Sam sam ){
        System.out.println(sam.toString());
    }

    public static void main(String[] args) {
        SamImplementation samImpl = new SamImplementation();
        System.out.println(samImpl.addition(5.5, 6));
        System.out.println(samImpl.subtraction(5.5, 6));
        System.out.println(samImpl.multiplication(3.5, 8));
        System.out.println(samImpl.division(36, 4.0));
        display(samImpl);
    }
}