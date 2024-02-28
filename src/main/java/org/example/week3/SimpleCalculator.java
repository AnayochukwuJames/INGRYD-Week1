package org.example.week3;

public class SimpleCalculator implements Arithmetic {

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
}