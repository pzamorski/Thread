package org.example;

public class CustoThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("CustomThread thread loop " + i);
            return;
        }
    }
}
