package org.example.week3;

public class CalculatorDemo {

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println(simpleCalculator.addition(35, 67));
        System.out.println(scientificCalculator.addition(56.7, 75));
        System.out.println(scientificCalculator.max(35.6, 40.3, 99.1, 99.14));

        System.out.println(scientificCalculator.doAdditionAgain(scientificCalculator, 400.5, 5600));
        System.out.println(scientificCalculator.findMax(scientificCalculator, 34.5, 45.6, 56.7, 67.8, 99.1));
    }


}