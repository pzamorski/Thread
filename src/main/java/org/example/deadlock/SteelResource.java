package org.example.deadlock;

public class SteelResource {

    public void getSteel(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Geting steel for thread: "+Thread.currentThread().getName());
    }
}
