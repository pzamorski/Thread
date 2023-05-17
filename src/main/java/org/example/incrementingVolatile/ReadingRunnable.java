package org.example.incrementingVolatile;

public class ReadingRunnable implements Runnable{

    SharedCounter sharedCounter;

    public ReadingRunnable(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    @Override
    public void run() {
        System.out.println("Reading counter "+sharedCounter.counter);
    }
}
