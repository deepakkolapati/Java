package com.deepak.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start the power car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate the car");
    }
}
