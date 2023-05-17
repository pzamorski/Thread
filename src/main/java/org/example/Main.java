package org.example;

import org.example.blockinqueue.CustomerRunnable;
import org.example.blockinqueue.RestaurantRunnable;
import org.example.callable.Divider;
import org.example.countDownlatch.HuntRunnable;
import org.example.countDownlatch.SellerRunnable;
import org.example.countDownlatch.SleepRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(3);
        BlockingQueue<String> orderQueue = new ArrayBlockingQueue<>(10);

        executorService.execute(new CustomerRunnable(orderQueue,"chicken","Pasta","Beef"));
        executorService.execute(new CustomerRunnable(orderQueue,"Lamb","Soup","Dumplings"));
        executorService.execute(new RestaurantRunnable(orderQueue));



//
//        List<Runnable> tasks = new ArrayList<>();
//        tasks.add(new HuntRunnable(countDownLatch));
//        tasks.add(new SleepRunnable(countDownLatch));
//        tasks.add(new SellerRunnable(countDownLatch));
//
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//        for(Runnable task : tasks){
//            executorService.submit(task);
//        }
//
//
//        try {
//            countDownLatch.await();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Team is alredy");

//        ExecutorService service = Executors.newFixedThreadPool(5);
//
//        List<Future<Double>> list = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            Future<Double> result = service.submit(new Divider((double) (i * 5)));
//            list.add(result);
//        }
//
//        for (Future<Double> result: list){
//            try {
//                System.out.println(result.get());
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//        System.out.println("End of main");

//        Dungeon dungeon = new Dungeon(3);
//
//        ExecutorService executorService= Executors.newFixedThreadPool(4);
//
//        for (int i = 0; i < 4; i++) {
//            executorService.submit(()->dungeon.tryToEnter());
//        }
//


//        ExecutorService executorService= Executors.newFixedThreadPool(5);
//
//        for (int i = 0; i < 7; i++) {
//
//            executorService.submit(new ExecutorServiceTask());
//        }


//        Thread thread1 = new Thread(new LoppedComputationRunnable());
//        thread1.setDaemon(true);
//        thread1.start();
//        thread1.interrupt();


//
//        Thread thread1 = new Thread(new CustomRunnable());
//        thread1.start();
//
//        Thread thread2 = new CustoThread();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        System.out.println("Job is done");


//        Thread second = new Thread(() -> secondThread());
//        second.setPriority(Thread.MAX_PRIORITY);
//        second.setName("secondLoopThread");
//        System.out.println("Prorytet second: "+second.getPriority());
//        System.out.println("Prorytet main: "+Thread.currentThread().getPriority());
//        second.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("Thread "+ t.getName()+" message "+ e.getMessage());
//            }
//        });
//        second.start();
//
//        mainThread();
    }

    private static void mainThread() {
        System.out.println("Start main thread " + Thread.currentThread().getName());
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("main thread loop " + i);
//        }
    }

    private static void secondThread() {
        System.out.println("Start second thread " + Thread.currentThread().getName());
        throw new RuntimeException("RuntimeException");
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("second thread loop " + i);
//        }
    }
}