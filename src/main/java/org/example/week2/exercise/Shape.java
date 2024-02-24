package org.example.week2.exercise;

import java.util.Scanner;

public class Shape {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape to calculate its area:");
        System.out.println("1. For a Circle");
        System.out.println("2. For a Triangle");
        System.out.println("3. For a Rectangle");
        System.out.println("4. For a Square");
        System.out.println("5. For a Cylinder");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateAreaCircle();
                break;
            case 2:
                calculateAreaTriangle();
                break;
            case 3:
                calculateAreaRectangle();
                break;
            case 4:
                calculateAreaSquare();
                break;
            case 5:
                calculateAreaCylinder();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 to 5.");
        }

        scanner.close();
    }

    public static void calculateAreaCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        scanner.close();
    }

    public static void calculateAreaTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
        scanner.close();
    }

    public static void calculateAreaRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
        scanner.close();
    }

    public static void calculateAreaSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double area = side * side;
        System.out.println("Area of the square: " + area);
        scanner.close();
    }

    public static void calculateAreaCylinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the base of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface area of the cylinder: " + area);
        scanner.close();
    }
}
