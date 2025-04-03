package com.deepak.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player;

    public NiceCar(){
        this.engine = new PowerEngine();
        this.player = new CdPlayer();
    }

    public void startEngine(){
        engine.start();
    }

    public void startMusic(){
        player.start();
    }
}
