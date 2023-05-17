package org.example.countDownlatch;

import java.util.concurrent.CountDownLatch;

public class HuntRunnable implements Runnable{

    private CountDownLatch countDownLatch;

    public HuntRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    private void hunt(){
        System.out.println(Thread.currentThread().getName()+ " Postać poluje");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+ " Postać wraca z polowania");


    }


    @Override
    public void run() {
        hunt();
        countDownLatch.countDown();
    }
}
