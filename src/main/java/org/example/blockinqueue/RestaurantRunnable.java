package org.example.blockinqueue;

import java.util.concurrent.BlockingQueue;

public class RestaurantRunnable implements Runnable{

    private BlockingQueue<String> orderQueue;

    public RestaurantRunnable(BlockingQueue<String> orderQueue) {
        this.orderQueue = orderQueue;
    }

    @Override
    public void run() {
while (true){
    try {
        String orderToGive=orderQueue.take();
        System.out.println("Given order: "+ orderToGive);
        Thread.sleep(4000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

}
    }
}
