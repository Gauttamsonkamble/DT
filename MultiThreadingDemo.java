package com.assignments.gauttam;



class HelloThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("HELLO");
            try {
                // Adding a small delay for better visibility of thread interleaving
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HiThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("HI");
            try {
                // Adding a small delay for better visibility of thread interleaving
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        HiThread hiThread = new HiThread();

        // Start both threads
        helloThread.start();
        hiThread.start();
    }
}
