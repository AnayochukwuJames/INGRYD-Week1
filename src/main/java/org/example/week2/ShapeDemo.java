package org.example.week2;

public class ShapeDemo {

    private int length;
    private double radius;

    public int getLength(){
        return length;
    }

    public double getRadius(){
        return radius;
    }

    public double area(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public double area(int length){
        return Math.pow(length, 2);
    }

    public static void main(String[] args) {
        ShapeDemo demo = new ShapeDemo();
        demo.area(7);
        demo.area(7.0);
    }
}