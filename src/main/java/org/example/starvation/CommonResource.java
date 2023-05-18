package org.example.starvation;

public class CommonResource {
    public synchronized void getResource(){
        System.out.println("Doping some heavy procesiiong "+Thread.currentThread().getName());

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
