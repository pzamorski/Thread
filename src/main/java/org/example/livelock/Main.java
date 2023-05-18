package org.example.livelock;

public class Main {
    public static void main(String[] args) {
        Chef chef1=new Chef("chef 1",true);
        Chef chef2=new Chef("chef 2",true);

        Pan pan=new Pan(chef1);

        Thread thread1=new Thread(()-> chef1.work(pan,chef2));

        Thread thread2=new Thread(()-> chef2.work(pan,chef1));

        thread1.start();
        thread2.start();

    }
}
