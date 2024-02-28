package org.example.week2.takeHome;

public class StringOperations {
    public static void main(String[] args) {
        // Write a program that initiates two strings, calculate the strings with a comma;
        // split the string using the split() method.

        String str1 = "Hello,world";
        String[] splitStrings = str1.split(",");
        System.out.println("Splitting the string with a comma:");
        for (String str : splitStrings) {
            System.out.println(str);
        }

        // Create two unequal strings; compare both strings and print out the boolean result
        String str2 = "Java";
        String str3 = "java";
        boolean isEqual = str2.equals(str3);
        System.out.println("\nComparing two unequal strings:");
        System.out.println("Are the strings equal? " + isEqual);

        // Write a string “Hello, world”. Write a code to replace the world with java Globe
        String str4 = "Hello, world";
        String replacedString = str4.replace("world", "Java Globe");
        System.out.println("\nReplacing 'world' with 'Java Globe':");
        System.out.println(replacedString);

        // Break this String into protocol, host, and endpoint “http://ingrydacademy.com/studenys”
        String url = "http://ingrydacademy.com/studenys";
        String[] parts = url.split("/");
        String protocol = parts[0];
        String host = parts[2];
        String endpoint = parts[3];
        System.out.println("\nBreaking the URL into protocol, host, and endpoint:");
        System.out.println("Protocol: " + protocol);
        System.out.println("Host: " + host);
        System.out.println("Endpoint: " + endpoint);
    }
}
