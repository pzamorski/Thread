package org.example.incrementingVolatile;

public class IncrementingRunnable implements Runnable{

    SharedCounter sharedCounter;

    public IncrementingRunnable(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            sharedCounter.counter=i;
        }
    }
}
