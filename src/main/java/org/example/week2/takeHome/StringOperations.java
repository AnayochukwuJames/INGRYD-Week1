package org.example.week2.takeHome;

public class StringOperations {
    public static void main(String[] args) {
        // Task 6: Splitting a string with a comma
        String str1 = "Hello,world";
        String[] splitStrings = str1.split(",");
        System.out.println("Task 6: Splitting the string with a comma:");
        for (String str : splitStrings) {
            System.out.println(str);
        }

        // Task 7: Comparing two unequal strings
        String str2 = "Java";
        String str3 = "java";
        boolean isEqual = str2.equals(str3);
        System.out.println("\nTask 7: Comparing two unequal strings:");
        System.out.println("Are the strings equal? " + isEqual);

        // Task 8: Replacing "world" with "Java Globe"
        String str4 = "Hello, world";
        String replacedString = str4.replace("world", "Java Globe");
        System.out.println("\nTask 8: Replacing 'world' with 'Java Globe':");
        System.out.println(replacedString);

        // Task 9: Breaking a URL into protocol, host, and endpoint
        String url = "http://ingrydacademy.com/studenys";
        String[] parts = url.split("/");
        String protocol = parts[0];
        String host = parts[2];
        String endpoint = parts[3];
        System.out.println("\nTask 9: Breaking the URL into protocol, host, and endpoint:");
        System.out.println("Protocol: " + protocol);
        System.out.println("Host: " + host);
        System.out.println("Endpoint: " + endpoint);
    }
}
