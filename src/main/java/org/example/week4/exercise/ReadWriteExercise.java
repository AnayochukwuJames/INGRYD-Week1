package org.example.week4.exercise;

import java.io.*;
import java.io.FileWriter;
import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class ReadWriteExercise {
    File readFrom = new File("C:\\Users\\Davidson Adepoju\\Desktop\\Projects\\Ingryd January Cohort\\src\\Week4\\read.txt");
    File writeTo = new File("C:\\Users\\Davidson Adepoju\\Desktop\\Projects\\Ingryd January Cohort\\src\\Week4\\readwrite.txt");

    public String readFromFile(){
        StringBuilder builder = new StringBuilder();
        String line = null;

        try(BufferedReader reader = new BufferedReader(new FileReader(readFrom))){
            while( (line = reader.readLine()) != null){
                builder.append(line).append("\n");
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        return builder.toString();
    }

    public String writeToFile(){
        String fileContent = readFromFile();
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputs = new StringBuilder();
        System.out.println("Enter a string and press enter key");
        String input = null;
        while( !(input = scanner.nextLine()).equals("stop")){
            System.out.println("Enter a string and press enter key");
            inputs.append(input).append("\n");
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(writeTo))){
            writer.write(fileContent + inputs.toString());
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        return fileContent + " " + inputs;
    }

}

class ReadWriteExerciseTest{
    public static void main(String[] args) {
        ReadWriteExercise exercise = new ReadWriteExercise();
        System.out.println(exercise.writeToFile());
    }
}