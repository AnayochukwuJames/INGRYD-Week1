package org.example.week4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {

            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException fileNotFoundException) {
            System.out.printf("The file %s could not be found: %s", fileName, fileNotFoundException.getMessage());

        }

    }  
    public static void main (String[]args) throws FileNotFoundException {
            readFile("C:\\Users\\USER\\IdeaProjects\\CodeSamples\\src\\Week4\\Text.txt");
            //readFile("text.txt);
        }
    }