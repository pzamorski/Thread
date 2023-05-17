package org.example;

public class LoppedComputationRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 2) {
            if (Thread.currentThread().isInterrupted()) {
System.out.println("Closing thread running");
return;
            }
                i++;
                i--;

        }
    }
}
