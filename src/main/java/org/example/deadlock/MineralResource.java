package org.example.deadlock;

public class MineralResource {
    public void getMinerals(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Geting mineral for thread: "+Thread.currentThread().getName());
    }
}
