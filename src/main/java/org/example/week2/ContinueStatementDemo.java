package org.example.week2;

public class ContinueStatementDemo {
    public static void main(String[] args) {

        int count = 1;
        do{
            if( count % 10 == 0){
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        } while( count <= 50);

    }
}