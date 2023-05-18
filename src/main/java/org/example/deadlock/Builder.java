package org.example.deadlock;

public class Builder {
    private MineralResource mineralResource = new MineralResource();
    private SteelResource steelResource= new SteelResource();

    public void buildShip(){
        synchronized (steelResource){
            steelResource.getSteel();
            synchronized (mineralResource){
                mineralResource.getMinerals();
            }
        }
        System.out.println("Ship has ben build in thread: "+Thread.currentThread().getName());

    }
    public void buildFighter(){
        synchronized (steelResource){
            steelResource.getSteel();
            synchronized (mineralResource){
                mineralResource.getMinerals();

            }
        }
        System.out.println("Fighter has ben build in thread: "+Thread.currentThread().getName());
    }
}
