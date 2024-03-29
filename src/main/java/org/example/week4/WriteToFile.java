package org.example.week4;

import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        File file = new File("/Users/decagon/IdeaProjects/INGRYD/src/main/java/org/example/week4/write.text");

        if(!file.exists()){
            System.out.println("File does not exist");
            return;
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true
                //append
                ));
            Scanner scanner = new Scanner(System.in)){
            String input;
            while (!(input = scanner.nextLine()).equals("eof")){
                bufferedWriter.write(input +"\n");
            }
        }catch (IOException e){
            System.out.println("Could not read from file" + e.getMessage());
        }
    }

}
