package org.example;

import org.example.week1.Mathematics;

public class Main {
    static Mathematics mathematics = new Mathematics();
    public static void main(String[] args) {
        System.out.println(mathematics.addition(10,3));
        System.out.println(mathematics.division(10,3));
        System.out.println(mathematics.multiplication(10,3));
        System.out.println(mathematics.division(10,3));
        System.out.println(mathematics.subtraction(10,3));
        System.out.println(mathematics.max(10,3));
    }
}