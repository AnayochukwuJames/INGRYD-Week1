package org.example.week2.exercise.shape;


import java.util.Scanner;

public class Main {
    public Main(double base) {
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 for Circle, 2 for Triangle, 3 for Rectangle, 4 for Square, 5 for Cylinder:");
            int choice = scanner.nextInt();

            org.example.week2.exercise.shape.Main shape;
            switch (choice) {
                case 1:
                    System.out.println("Enter radius of the circle:");
                    double radius = scanner.nextDouble();
                    shape = new Main(radius);
                    break;
                case 2:
                    System.out.println("Enter base and height of the triangle:");
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    shape = new Main(base);
                    break;
                case 3:
                    System.out.println("Enter length and width of the rectangle:");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    shape = new Main(length);
                    break;
                case 4:
                    System.out.println("Enter side of the square:");
                    double side = scanner.nextDouble();
                    shape = new Main(side);
                    break;
                case 5:
                    System.out.println("Enter radius and height of the cylinder:");
                    double cylRadius = scanner.nextDouble();
                    double cylHeight = scanner.nextDouble();
                    shape = new Main(cylRadius);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            double area = shape.calculateArea();
            System.out.println("Area of the shape: " + area);
        }

    private double calculateArea() {
        return calculateArea();
    }
}


