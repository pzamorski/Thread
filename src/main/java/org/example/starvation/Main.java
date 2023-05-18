package org.example.starvation;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CommonResource commonResource= new CommonResource();

        Thread thread1=new Thread(new Starvatin(commonResource),"max prority");
        Thread thread2=new Thread(new Starvatin(commonResource),"2 prority");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(2);

        Random random = new Random();


        thread1.start();
        thread2.start();

        for (int i = 0; i < 10;  i++) {
            Thread thread= new Thread(new Starvatin(commonResource), "thread"+i);
            thread.setPriority(random.nextInt(10)+1);
            thread.start();

        }
    }
}
