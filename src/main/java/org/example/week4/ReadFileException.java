package org.example.week4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileException {
    public static void readFile(String fileName){
        FileReader reader = null;
        try {
            reader = new FileReader(fileName);
            char line = (char) reader.read();
            while (line != -1 ) {
                System.out.println(line);
                line = (char) reader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.printf("The file %s could not be found: %s ", fileName, e.getMessage());   
        } catch( IOException e) {
            System.out.printf("The file %s could not be found: %s ", fileName, e.getMessage());
        } finally {
            try {
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }
    public static void main(String[] args) {
        readFile("/Users/decagon/IdeaProjects/INGRYD/src/main/java/org/example/week4/Read.text");

    } 
}