package org.example.week5;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("I am running from the RunnableDemo class");
    }

    public static void main(String[] args) {
        Runnable internalRunnable = () -> {
            System.out.println("Internal Runner from InternalRunnable");
            System.out.println("Another internal printout");
        };

        Thread thread1 = new Thread(new RunnableDemo());
        Thread thread2 = new Thread(internalRunnable);

        thread1.start();
        thread2.start();

    }
}