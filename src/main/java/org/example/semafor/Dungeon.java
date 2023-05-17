package org.example.semafor;

import java.util.concurrent.Semaphore;

public class Dungeon {

    public Dungeon(int limitOFplayers) {
        this.semaphore = new Semaphore(limitOFplayers);
    }

    private int limitOFplayers;
    private Semaphore semaphore;
    public void tryToEnter(){

        try {
            semaphore.acquire();
            System.out.println("Player from the thred "+Thread.currentThread().getName()+" enter to dungeon");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Player from the thred "+Thread.currentThread().getName()+" leaves to dungeon");
            semaphore.release();
        }

    }
}
