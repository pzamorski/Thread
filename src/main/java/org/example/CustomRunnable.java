package org.example;

public class CustomRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("CustomRunnable thread loop " + i);
        }
    }
}
