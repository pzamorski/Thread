package org.example.countDownlatch;

import java.util.concurrent.CountDownLatch;

public class SellerRunnable implements Runnable{


    private CountDownLatch countDownLatch;

    public SellerRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    private void sleep(){
        System.out.println(Thread.currentThread().getName()+ " Postać śpi");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+ " Postać się budzi");


    }


    @Override
    public void run() {
        sleep();
        countDownLatch.countDown();
    }
}
