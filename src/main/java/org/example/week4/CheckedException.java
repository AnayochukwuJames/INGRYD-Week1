package org.example.week4;

public class CheckedException {
    public static void main(String[] args) {

        for(int i = 0; i < 20; i++){
            if(i % 3 == 0){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException exception){
                    System.out.println("The thread was interrupted");
                }
            }
            System.out.println(i);
        }
    }
}