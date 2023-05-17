package org.example.countDownlatch;

import java.util.concurrent.CountDownLatch;

public class SleepRunnable implements Runnable{

    private CountDownLatch countDownLatch;

    public SleepRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    private void sell(){
        System.out.println(Thread.currentThread().getName()+ " Postać sprzedaje");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+ " Postać sprzedala wszystko");


    }


    @Override
    public void run() {
        sell();
        countDownLatch.countDown();
    }
}
