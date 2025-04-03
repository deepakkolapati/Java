package com.deepak.interfaces;

public class Car implements Engine,Brake{
    @Override
    public void brake() {
        System.out.println("Slow down the car");
    }

    @Override
    public void start() {
        System.out.println("Start the car");
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
