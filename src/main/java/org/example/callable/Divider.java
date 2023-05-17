package org.example.callable;

import java.io.PrintStream;
import java.util.concurrent.Callable;

public class Divider implements Callable<Double> {


    private Double number;


    public Divider(Double number) {
        this.number = number;
    }

    @Override
    public Double call() throws Exception {
        System.out.println("In Thread: "+Thread.currentThread().getName());
        Thread.sleep(1000);
        System.out.println("Out Thread: "+Thread.currentThread().getName());
        return number/2;
    }
}
