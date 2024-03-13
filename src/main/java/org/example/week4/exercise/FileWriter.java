package org.example.week4.exercise;

import java.io.*;
import java.util.Scanner;

public class FileWriter {
    public static void main(String[] args) {

        File readFile = new File("/Users/decagon/IdeaProjects/INGRYD/src/main/java/org/example/week4/exercise/read.txt");
        File writeFile = new File("/Users/decagon/IdeaProjects/INGRYD/src/main/java/org/example/week4/exercise/readwrite.txt");

        try {
            String fileContent = readFileContent(readFile);
            String userInput = getUserInput();
            writeToFile(writeFile, fileContent + userInput);
            System.out.println("Text successfully written to " + writeFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String readFileContent(File file) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                contentBuilder.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw new IOException("File '" + file.getName() + "' not found", e);
        }
        return contentBuilder.toString();
    }
    private static String getUserInput() {
        System.out.println("Enter additional text:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine() + "\n";
    }
    private static void writeToFile(File file, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(file))) {
            writer.write(content);
        }
    }
}
