package org.example.starvation;

public class Starvatin implements Runnable{
    private CommonResource commonResource;

    public Starvatin(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        commonResource.getResource();
    }
}
